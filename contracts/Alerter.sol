// SPDX-License-Identifier: GPL-3.0
// pragma solidity >=0.8.0 <=0.9.0;
pragma solidity >=0.5.16;
pragma experimental ABIEncoderV2;


import "./Constants.sol";
import "./Queue.sol";

contract Alerter{
// To access enqueue of the queue. The constructor might need address to be passed. Verify it.
    Queue queue;
    constructor(Queue _queue) public{
        queue = _queue;
    }

    // Count of currently open alerts.
    uint alert_Count = 0;

    // Count of Community first responders initial responded alerts. This is just incremented. Has no real meaning, just done to perform interaction b/w CFR and Alerter.
    uint cfrResponded_Alerts_Count = 0;

    // Event is raised when a new alert is created
    event AlertCreated(string desc);

    // // function to retrieve all the open alerts
    // function getAlerts() public view returns(Alert[] memory){
    //     return alerts;
    // }


    // Increments the count of the initial responses from CFR
    function cfrInitialResponse() public{
        cfrResponded_Alerts_Count++;
    }

    // Returns the alert type constant using the user entered string
    function get_AlertType_from_string(string memory alertType) private pure returns(Constants.Alert_Type){
    if( keccak256(abi.encodePacked((alertType))) == keccak256(abi.encodePacked(("Fire"))) )
        return Constants.Alert_Type.Fire_Alert;
    else if( keccak256(abi.encodePacked((alertType))) == keccak256(abi.encodePacked(("Health"))) )
        return Constants.Alert_Type.Health_Emergency_Alert;
    else if( keccak256(abi.encodePacked((alertType))) == keccak256(abi.encodePacked(("Theft"))) )
        return Constants.Alert_Type.Theft_Alert;                
    else 
        return Constants.Alert_Type.Invalid_Alert;
    }


    function setAlert(string memory title, string memory description, string memory recipient_Address, Constants.Alert_Type alertType) private{
        alert_Count++;
        Constants.Alert memory alert = Constants.Alert({
            alertId : alert_Count,
            title : title,
            description : description,
            recipient_Address : recipient_Address,
            type_Of_Alert : alertType,
            responder_Address : address(0),
            status : Constants.Alert_Status.Open
        });
        queue.enqueue(alert);
        emit AlertCreated(alert.title);
    }

    // Create a new Alert using this method
    function createAlert(string memory title, string memory description, string memory recipient_Address, string memory alertType) public {
        setAlert(title, description, recipient_Address, get_AlertType_from_string(alertType));
    }
}