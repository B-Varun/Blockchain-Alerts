// SPDX-License-Identifier: GPL-3.0
pragma solidity >=0.5.16;

import "./Constants.sol";

// The queue contract ensures FIFO ordering of the alerts, ie., the alert that is raised 1st will be responded first.
// Right now, there is no method for responding to the alerts in random order, it can be added later if required.
// Generally, a queue contains indexes first and last, since I am using 2 arrays I am not using the pointers.
contract Queue{

// Keeps track of all the alerts that are currently open
 Alert[] openAlerts;

//  Tracks the list of alerts that are responded and closed by the responder
 Alert[] closedAlerts;

// Enqueue is only invoked by the Alerter to register a new alert.
// Adds the new alert to the end of the array that contains open alerts.
 function enqueue(Alert memory alert) public returns(uint){
    openAlerts.push(alert);
    return openAlerts.length;
 }

// Dequeue is invoked only by the Responder to close the alert,
// Firstly, the alert at the 1st position of the openAlerts array is removed and added to the end of the closedAlerts. This ensures the FIFO order 
 function dequeue() public returns(uint){
    // Check if there are any open alerts or not.
    require(openAlerts.length>0);
    // Holding the 1st alert to put into closed state.
    Alert memory alert = openAlerts[0];

    /* 
     Replacing the 1st alert from open alerts array. This maintains the FIFO order
     So the loop copies all the elements to its previous index. 
     Next step is to delete the last element since it is already copied to its previous index.
    */
    for(uint i=1; i<openAlerts.length; i++){
        openAlerts[i-1] = openAlerts[i];
    }

    openAlerts.pop();

    // Mark the alert as closed and add it to the closedAlerts array
    alert.status = Alert_Status.Closed;
    closedAlerts.push(alert);
    
    // Return the number of Open Alerts
    return openAlerts.length;
 } 

 function list_All_OpenAlerts() public view returns(Alert[] memory){
    return openAlerts;
 }

 function list_All_Responded_Alerts() public view returns(Alert[] memory){
    return closedAlerts;
 }

}