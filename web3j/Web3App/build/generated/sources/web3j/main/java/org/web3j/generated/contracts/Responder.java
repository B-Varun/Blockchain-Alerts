package org.web3j.generated.contracts;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import org.web3j.abi.FunctionEncoder;
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
import org.web3j.protocol.core.RemoteCall;
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
 * <p>Generated with web3j version 4.10.1.
 */
@SuppressWarnings("rawtypes")
public class Responder extends Contract {
    public static final String BINARY = "60806040525f6001553480156012575f80fd5b50604051610643380380610643833981016040819052602f916052565b5f80546001600160a01b0319166001600160a01b0392909216919091179055607d565b5f602082840312156061575f80fd5b81516001600160a01b03811681146076575f80fd5b9392505050565b6105b98061008a5f395ff3fe608060405234801561000f575f80fd5b506004361061003f575f3560e01c806342fa4a3114610043578063b9f4aa0a14610061578063be0de11d14610069575b5f80fd5b61004b610073565b60405161005891906101f7565b60405180910390f35b61004b6100e5565b61007161012b565b005b5f8054604080516330afc1a560e11b815290516060936001600160a01b039093169263615f834a92600480820193918290030181865afa1580156100b9573d5f803e3d5ffd5b505050506040513d5f823e601f3d908101601f191682016040526100e091908101906103f5565b905090565b5f805460408051636553a3bf60e01b815290516060936001600160a01b0390931692636553a3bf92600480820193918290030181865afa1580156100b9573d5f803e3d5ffd5b5f8054906101000a90046001600160a01b03166001600160a01b031663957908d16040518163ffffffff1660e01b81526004016020604051808303815f875af115801561017a573d5f803e3d5ffd5b505050506040513d601f19601f8201168201806040525081019061019e919061056c565b50565b5f81518084528060208401602086015e5f602082860101526020601f19601f83011685010191505092915050565b634e487b7160e01b5f52602160045260245ffd5b600281106101f3576101f36101cf565b9052565b5f60208083018184528085518083526040925060408601915060408160051b8701018488015f5b838110156102d657603f19898403018552815160e08151855288820151818a87015261024c828701826101a1565b915050878201518582038987015261026482826101a1565b9150506060808301518683038288015261027e83826101a1565b9250505060808083015160048110610298576102986101cf565b9086015260a0828101516001600160a01b03169086015260c091820151916102c2818701846101e3565b50958801959350509086019060010161021e565b509098975050505050505050565b634e487b7160e01b5f52604160045260245ffd5b60405160e0810167ffffffffffffffff8111828210171561031b5761031b6102e4565b60405290565b604051601f8201601f1916810167ffffffffffffffff8111828210171561034a5761034a6102e4565b604052919050565b5f82601f830112610361575f80fd5b815167ffffffffffffffff81111561037b5761037b6102e4565b61038e601f8201601f1916602001610321565b8181528460208386010111156103a2575f80fd5b8160208501602083015e5f918101602001919091529392505050565b8051600481106103cc575f80fd5b919050565b80516001600160a01b03811681146103cc575f80fd5b8051600281106103cc575f80fd5b5f6020808385031215610406575f80fd5b825167ffffffffffffffff8082111561041d575f80fd5b818501915085601f830112610430575f80fd5b815181811115610442576104426102e4565b8060051b610451858201610321565b918252838101850191858101908984111561046a575f80fd5b86860192505b8383101561055f57825185811115610486575f80fd5b860160e0818c03601f1901121561049b575f80fd5b6104a36102f8565b888201518152604080830151888111156104bb575f80fd5b6104c98e8c83870101610352565b8b84015250606080840151898111156104e0575f80fd5b6104ee8f8d83880101610352565b8385015250608091508184015189811115610507575f80fd5b6105158f8d83880101610352565b82850152505060a06105288185016103be565b8284015260c0915061053b8285016103d1565b9083015261054b60e084016103e7565b908201528352509186019190860190610470565b9998505050505050505050565b5f6020828403121561057c575f80fd5b505191905056fea2646970667358221220f2a710d2d79601a559ae96ba26fc1f59eaeefa42a403ad79a1cb054bc5c736de64736f6c63430008190033";

    public static final String FUNC_GET_CLOSED_ALERTS = "get_Closed_Alerts";

    public static final String FUNC_GET_OPEN_ALERTS = "get_Open_Alerts";

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

    public static RemoteCall<Responder> deploy(Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider, String _address) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, _address)));
        return deployRemoteCall(Responder.class, web3j, credentials, contractGasProvider, BINARY, encodedConstructor);
    }

    public static RemoteCall<Responder> deploy(Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider, String _address) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, _address)));
        return deployRemoteCall(Responder.class, web3j, transactionManager, contractGasProvider, BINARY, encodedConstructor);
    }

    @Deprecated
    public static RemoteCall<Responder> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit, String _address) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, _address)));
        return deployRemoteCall(Responder.class, web3j, credentials, gasPrice, gasLimit, BINARY, encodedConstructor);
    }

    @Deprecated
    public static RemoteCall<Responder> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit, String _address) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, _address)));
        return deployRemoteCall(Responder.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, encodedConstructor);
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
