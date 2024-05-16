// SPDX-License-Identifier: GPL-3.0
// pragma solidity >=0.8.0 <=0.9.0;
pragma solidity >=0.5.16;
pragma experimental ABIEncoderV2;


import "./Constants.sol";
import "./Queue.sol";
import "./CFR.sol";

contract Responder{

    // To access dequeue of the queue. The constructor might need Address, verify it.
    Queue queue;
    CFR cfr;
    Alerter alerter;
 
    address[] public cfrAddresses;
    mapping(address => bool) is_CFR_Responding;

    constructor(Queue _address, Alerter _Alerter, CFR _cfrAddr) public{
        // queue = Queue(_address);
        queue = _address;
        alerter = _Alerter;
        cfr = _cfrAddr;
    }

    // Count of closed alerts. Currently has no increment since it is done in the Queue, check when to increment.
    uint alertsResponded = 0;


    function addCFR(address cfrAddress) public {
        cfrAddresses.push(cfrAddress);
    }

    function get_Open_Alerts() public view returns(Constants.Alert[] memory){
        return queue.list_All_OpenAlerts();
    }

    function get_Closed_Alerts() public view returns(Constants.Alert[] memory){
        return queue.list_All_Responded_Alerts();
    }

    // Assuming that there is atleast 1 CFR available at all the times.
    // Not checking if CFR is already responding or not. But we might need it.
    function getAvailableCFR() private returns (address){
        address addr = cfrAddresses[0];
        cfrAddresses[0] = cfrAddresses[cfrAddresses.length-1];
        cfrAddresses.pop();
        is_CFR_Responding[addr] = true;
        return addr;        
    }

    // Respond to an alert
    function respond_To_Alert() public returns(uint){
        Constants.Alert memory alert = queue.dequeue();
        if(alert.alertId > 0)
        {
            address addr = getAvailableCFR();
            cfr.provideInitialResponse();
            is_CFR_Responding[addr] = false;
            cfrAddresses.push(addr);
            alertsResponded++;
        }
    }
}