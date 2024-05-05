// SPDX-License-Identifier: GPL-3.0
// pragma solidity >=0.8.0 <=0.9.0;
pragma solidity >=0.5.16;

contract AlertManagement{

    // Count of currently open alerts
    int alert_Count = 0;

    // Array to store alerts
    Alert[] public alerts;

    // Event is raised when a new alert is created
    event AlertCreated(string desc);

    enum Alert_Status{
        Open, 
        Closed
    }
    
    enum Alert_Type{
        Fire_Alert,
        Theft_Alert,
        Health_Emergency_Alert
    }

    struct Alert{
        int alertId;
        string title;
        string description;
        string recipient_Address;
        Alert_Type type_Of_Alert;
        address responder_Address;
        Alert_Status status;
    }

    // function to retrieve all the open alerts
    function getAlerts() public view returns(Alert[] memory){
        return alerts;
    }

    // Returns the alert type constant using the user entered string
    function get_AlertType_from_string(string memory alertType) private pure returns(Alert_Type){
    if( keccak256(abi.encodePacked((alertType))) == keccak256(abi.encodePacked(("Fire"))) )
        return Alert_Type.Fire_Alert;
    else if( keccak256(abi.encodePacked((alertType))) == keccak256(abi.encodePacked(("Health"))) )
        return Alert_Type.Health_Emergency_Alert;
    if( keccak256(abi.encodePacked((alertType))) == keccak256(abi.encodePacked(("Theft"))) )
        return Alert_Type.Theft_Alert;                
    }


    function setAlert(string memory title, string memory description, string memory recipient_Address, Alert_Type alertType) private{
        alert_Count++;
        Alert memory alert = Alert({
            alertId : alert_Count,
            title : title,
            description : description,
            recipient_Address : recipient_Address,
            type_Of_Alert : alertType,
            responder_Address : address(0),
            status : Alert_Status.Open
        });
        alerts.push(alert);
        emit AlertCreated(alert.title);
    }

    // Create a new Alert using this method
    function createAlert(string memory title, string memory description, string memory recipient_Address, string memory alertType) public {
        setAlert(title, description, recipient_Address, get_AlertType_from_string(alertType));
    }

}