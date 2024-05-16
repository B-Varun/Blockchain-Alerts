// SPDX-License-Identifier: GPL-3.0
pragma solidity >=0.5.16;
pragma experimental ABIEncoderV2;

import "./Alerter.sol";

contract CFR{

    Alerter alerter;

    constructor(Alerter alerterAddr) public{
        alerter = alerterAddr;
    }

    function provideInitialResponse() public returns(uint){
        return alerter.cfrInitialResponse();
    }
}