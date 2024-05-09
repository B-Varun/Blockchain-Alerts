// DeployContracts.js

const Queue = artifacts.require("Queue");
const Alerter = artifacts.require("Alerter");
const Responder = artifacts.require("Responder");

module.exports = async function(deployer) {
  // Deploy Queue contract
  await deployer.deploy(Queue);
  const queueInstance = await Queue.deployed();

 // Deploy Aleter contract
 await deployer.deploy(Alerter, queueInstance.address);
 const aleterInstance = await Alerter.deployed();
 
 // Deploy Responder contract
 await deployer.deploy(Responder, queueInstance.address);
 const responderInstance = await Responder.deployed();

  console.log("Queue contract deployed at address:", queueInstance.address);
  console.log("Alerter contract deployed at address:", aleterInstance.address);
  console.log("Responder contract deployed at address:", responderInstance.address);  
};
