package com.java.responder;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import org.web3j.abi.TypeReference;
import org.web3j.abi.datatypes.Address;
import org.web3j.abi.datatypes.DynamicArray;
import org.web3j.abi.datatypes.DynamicStruct;
import org.web3j.abi.datatypes.Function;
import org.web3j.abi.datatypes.Type;
import org.web3j.abi.datatypes.Utf8String;
import org.web3j.abi.datatypes.generated.Uint256;
import org.web3j.abi.datatypes.generated.Uint8;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.RemoteFunctionCall;
import org.web3j.protocol.core.methods.response.TransactionReceipt;
import org.web3j.tx.Contract;
import org.web3j.tx.TransactionManager;
import org.web3j.tx.gas.ContractGasProvider;

/**
 * <p>Auto generated code.
 * <p><strong>Do not modify!</strong>
 * <p>Please use the <a href="https://docs.web3j.io/command_line.html">web3j command line tools</a>,
 * or the org.web3j.codegen.SolidityFunctionWrapperGenerator in the 
 * <a href="https://github.com/web3j/web3j/tree/master/codegen">codegen module</a> to update.
 *
 * <p>Generated with web3j version 1.5.0.
 */
@SuppressWarnings("rawtypes")
public class Responder extends Contract {
    public static final String BINARY = "Bin file was not provided";

    public static final String FUNC_GET_OPEN_ALERTS = "get_Open_Alerts";

    public static final String FUNC_GET_CLOSED_ALERTS = "get_Closed_Alerts";

    public static final String FUNC_RESPOND_TO_ALERT = "respond_To_Alert";

    @Deprecated
    protected Responder(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    protected Responder(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    @Deprecated
    protected Responder(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    protected Responder(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteFunctionCall<List> get_Open_Alerts() {
        final Function function = new Function(FUNC_GET_OPEN_ALERTS, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<DynamicArray<Alert>>() {}));
        return new RemoteFunctionCall<List>(function,
                new Callable<List>() {
                    @Override
                    @SuppressWarnings("unchecked")
                    public List call() throws Exception {
                        List<Type> result = (List<Type>) executeCallSingleValueReturn(function, List.class);
                        return convertToNative(result);
                    }
                });
    }

    public RemoteFunctionCall<List> get_Closed_Alerts() {
        final Function function = new Function(FUNC_GET_CLOSED_ALERTS, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<DynamicArray<Alert>>() {}));
        return new RemoteFunctionCall<List>(function,
                new Callable<List>() {
                    @Override
                    @SuppressWarnings("unchecked")
                    public List call() throws Exception {
                        List<Type> result = (List<Type>) executeCallSingleValueReturn(function, List.class);
                        return convertToNative(result);
                    }
                });
    }

    public RemoteFunctionCall<TransactionReceipt> respond_To_Alert() {
        final Function function = new Function(
                FUNC_RESPOND_TO_ALERT, 
                Arrays.<Type>asList(), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    @Deprecated
    public static Responder load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new Responder(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    @Deprecated
    public static Responder load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new Responder(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public static Responder load(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        return new Responder(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static Responder load(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return new Responder(contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public static class Alert extends DynamicStruct {
        public BigInteger alertId;

        public String title;

        public String description;

        public String recipient_Address;

        public BigInteger type_Of_Alert;

        public String responder_Address;

        public BigInteger status;

        public Alert(BigInteger alertId, String title, String description, String recipient_Address, BigInteger type_Of_Alert, String responder_Address, BigInteger status) {
            super(new org.web3j.abi.datatypes.generated.Uint256(alertId), 
                    new org.web3j.abi.datatypes.Utf8String(title), 
                    new org.web3j.abi.datatypes.Utf8String(description), 
                    new org.web3j.abi.datatypes.Utf8String(recipient_Address), 
                    new org.web3j.abi.datatypes.generated.Uint8(type_Of_Alert), 
                    new org.web3j.abi.datatypes.Address(160, responder_Address), 
                    new org.web3j.abi.datatypes.generated.Uint8(status));
            this.alertId = alertId;
            this.title = title;
            this.description = description;
            this.recipient_Address = recipient_Address;
            this.type_Of_Alert = type_Of_Alert;
            this.responder_Address = responder_Address;
            this.status = status;
        }

        public Alert(Uint256 alertId, Utf8String title, Utf8String description, Utf8String recipient_Address, Uint8 type_Of_Alert, Address responder_Address, Uint8 status) {
            super(alertId, title, description, recipient_Address, type_Of_Alert, responder_Address, status);
            this.alertId = alertId.getValue();
            this.title = title.getValue();
            this.description = description.getValue();
            this.recipient_Address = recipient_Address.getValue();
            this.type_Of_Alert = type_Of_Alert.getValue();
            this.responder_Address = responder_Address.getValue();
            this.status = status.getValue();
        }
    }
}
