// SPDX-License-Identifier: GPL-3.0
// pragma solidity >=0.8.0 <=0.9.0;
pragma solidity >=0.5.16;

contract AlertManagement{

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

    

}