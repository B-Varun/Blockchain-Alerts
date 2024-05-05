import "./App.css";
import { ethers } from "ethers";
import { useState, useEffect } from "react";
import contractABI from "./abi/contractABI.json";
import Header from "./components/Header";

function App() {
  const [account, setAccount] = useState("");
  const [signer, setSigner] = useState(null);
  const [alerterContractInstance, setAlerterContractInstance] = useState(null);
  const [responderContractInstance, setResponderContractInstance] =
    useState(null);
  const [responderContract, setResponderContract] = useState(null);

  const listenToEvent = () => {
    console.log("Not sure why its not printing\n\n");

    console.log("\n\n\nContract instance : ");
    console.log(alerterContractInstance);
    if (alerterContractInstance) {
      alerterContractInstance.on("AlertCreated", (str) => {
        console.log("Desc of the alert is : " + str);
        if (responderContractInstance) {
          console.log("Responder instance : ");
          console.log(responderContractInstance);
          // Code to respond to events
          console.log("\n\nGot an event\n\n");
          responderContractInstance.handleAlert();
        } else {
          console.log("Responder instance not available");
        }
      });
    } else {
      console.log(
        "Alerter Contract instance not available for listening to events"
      );
    }
  };

  const connect = async () => {
    // const myBlockchain_URL = "http://127.0.0.1:7545";
    const myBlockchain_URL = "http://127.0.0.1:7545";

    if (typeof window.ethereum !== "undefined") {
      const accounts = await window.ethereum.request({
        method: "eth_requestAccounts",
      });

      const provider = new ethers.providers.JsonRpcProvider(myBlockchain_URL);
      const signer = provider.getSigner();
      setSigner(signer);
      setAccount(accounts[0]);

      const alerterContractAddress =
        "0xd7C6f9bc69BF9162C5A137D28eEd15071Eea8082";
      const responderContractAddress =
        "0x7294d76791BCDE5C73F7849a38Fe71af8221d73D";
      const alerterContract = new ethers.Contract(
        alerterContractAddress,
        contractABI,
        signer
      );
      const responderContract = new ethers.Contract(
        responderContractAddress,
        contractABI,
        signer
      );
      setAlerterContractInstance(alerterContract);
      setResponderContractInstance(responderContract);

      console.log("Alerter Contract : ");
      console.log(alerterContract);
      console.log("account : " + accounts[0]);
      console.log(signer);
    } else {
      console.log("Please install metamask.");
    }
  };

  const createAlert = async () => {
    if (alerterContractInstance) {
      try {
        // let alertId = await alerterContractInstance.getNext_AlertId();
        // console.log("Next Alert Id is : " + alertId);
        // console.log(alertId);

        const title = "1st Alert";

        console.log("Creating an alert obj");

        const transactionInstance = await alerterContractInstance.createAlert(
          title,
          "Fire"
        );
        console.log("Before Transaction");
        await transactionInstance.wait();
        console.log("Alert Created!");
      } catch (error) {
        console.error("Error creating an alert", error);
      }
    } else {
      console.log("Contract instance not available");
    }
  };

  useEffect(() => {
    console.log("Connecting");
    connect();
    listenToEvent();
  }, []);

  return (
    <div className="page">
      <Header connect={connect} account={account} />
      <div className="main">
        <h1>Alerts</h1>
        <br />
        <button className="button" onClick={createAlert}>
          Create an Alert
        </button>
      </div>
    </div>
  );
}

export default App;
