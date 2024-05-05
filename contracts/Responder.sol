// SPDX-License-Identifier: GPL-3.0
// pragma solidity >=0.8.0 <=0.9.0;
pragma solidity >=0.5.16;

import "./AlertManagement.sol";

contract Responder{
    
    //  Initializing the AlertManagement Smart Contract to access the open alerts for responding
    AlertManagement public management;

    // Constructor to initialize the AlertManagement object
    constructor(address _address){
        management = AlertManagement(_address);
    }

    // Count of closed alerts
    int alertsResponded = 0;
    
    //  Array to store the Alert ID's of the responder closed alerts
    AlertManagement.Alert[] public respondedAlerts;

    function get_Open_Alerts() private view returns(AlertManagement.Alert[] memory){
        return management.getAlerts();
    }


// Function pending, add a way to close the alert. ***********
    function respond_With_AlertId(int alertId) public{
        get_Open_Alerts()[alertId] = management.Alert_Status.Closed;
        respondedAlerts.push(get_Open_Alerts()[alertId]);
        alertsResponded++;
    }


}