// DeployContracts.js

const Queue = artifacts.require("Queue");
const Alerter = artifacts.require("Alerter");
const Responder = artifacts.require("Responder");
const CFR = artifacts.require("CFR.sol");

module.exports = async function(deployer) {
  // Deploy Queue contract
  await deployer.deploy(Queue);
  const queueInstance = await Queue.deployed();

 // Deploy Aleter contract
 await deployer.deploy(Alerter, queueInstance.address);
 const alerterInstance = await Alerter.deployed();
 
 // Deploy CFR contract
 await deployer.deploy(CFR, alerterInstance.address);
 const cfrInstance = await CFR.deployed();
 
 // Deploy Responder contract
 await deployer.deploy(Responder, queueInstance.address, alerterInstance.address, cfrInstance.address);
 const responderInstance = await Responder.deployed();

  console.log("Queue contract deployed at address:", queueInstance.address);
  console.log("Alerter contract deployed at address:", alerterInstance.address);
  console.log("CFR contract deployed at address:", cfrInstance.address);    
  console.log("Responder contract deployed at address:", responderInstance.address);  
};
