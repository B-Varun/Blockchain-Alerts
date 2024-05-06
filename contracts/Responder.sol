// SPDX-License-Identifier: GPL-3.0
// pragma solidity >=0.8.0 <=0.9.0;
pragma solidity >=0.5.16;

import "./Constants.sol";
import "./Queue.sol";

contract Responder{

    // To access dequeue of the queue. The constructor might need Address, verify it.
    Queue queue;
    constructor(Queue _address){
        // queue = Queue(_address);
        queue = _address;
    }

    // Count of closed alerts. Currently has no increment since it is done in the Queue, check when to increment.
    uint alertsResponded = 0;
    

    function get_Open_Alerts() public view returns(Alert[] memory){
        return queue.list_All_OpenAlerts();
    }

    function get_Closed_Alerts() public view returns(Alert[] memory){
        return queue.list_All_Responded_Alerts();
    }

    // Respond to an alert
    function respond_To_Alert() public{
        queue.dequeue();
    }
}