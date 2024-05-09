package org.web3j.generated.contracts;

import io.reactivex.Flowable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.web3j.abi.EventEncoder;
import org.web3j.abi.FunctionEncoder;
import org.web3j.abi.TypeReference;
import org.web3j.abi.datatypes.Event;
import org.web3j.abi.datatypes.Function;
import org.web3j.abi.datatypes.Type;
import org.web3j.abi.datatypes.Utf8String;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.DefaultBlockParameter;
import org.web3j.protocol.core.RemoteCall;
import org.web3j.protocol.core.RemoteFunctionCall;
import org.web3j.protocol.core.methods.request.EthFilter;
import org.web3j.protocol.core.methods.response.BaseEventResponse;
import org.web3j.protocol.core.methods.response.Log;
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
public class Alerter extends Contract {
    public static final String BINARY = "60806040525f6001553480156012575f80fd5b50604051610607380380610607833981016040819052602f916052565b5f80546001600160a01b0319166001600160a01b0392909216919091179055607d565b5f602082840312156061575f80fd5b81516001600160a01b03811681146076575f80fd5b9392505050565b61057d8061008a5f395ff3fe608060405234801561000f575f80fd5b5060043610610029575f3560e01c806348ac10d51461002d575b5f80fd5b61004061003b36600461032b565b610042565b005b6100568484846100518561005c565b61017f565b50505050565b604051634669726560e01b60208201525f90602401604051602081830303815290604052805190602001208260405160200161009891906103d1565b60405160208183030381529060405280519060200120036100ba57505f919050565b60405165090cac2d8e8d60d31b602082015260260160405160208183030381529060405280519060200120826040516020016100f691906103d1565b604051602081830303815290604052805190602001200361011957506002919050565b60405164151a19599d60da1b6020820152602501604051602081830303815290604052805190602001208260405160200161015491906103d1565b604051602081830303815290604052805190602001200361017757506001919050565b506003919050565b60018054905f61018e836103e7565b91905055505f6040518060e0016040528060015481526020018681526020018581526020018481526020018360038111156101cb576101cb61040b565b81525f602082018190526040909101525f54604051635a03667160e11b81529192506001600160a01b03169063b406cce29061020b908490600401610461565b6020604051808303815f875af1158015610227573d5f803e3d5ffd5b505050506040513d601f19601f8201168201806040525081019061024b9190610517565b507fc33718af7bbce47bec37033c83a13e4cdd4358e5fd4e2c880e87e2825ea6068c816020015160405161027f919061052e565b60405180910390a15050505050565b634e487b7160e01b5f52604160045260245ffd5b5f82601f8301126102b1575f80fd5b813567ffffffffffffffff808211156102cc576102cc61028e565b604051601f8301601f19908116603f011681019082821181831017156102f4576102f461028e565b8160405283815286602085880101111561030c575f80fd5b836020870160208301375f602085830101528094505050505092915050565b5f805f806080858703121561033e575f80fd5b843567ffffffffffffffff80821115610355575f80fd5b610361888389016102a2565b95506020870135915080821115610376575f80fd5b610382888389016102a2565b94506040870135915080821115610397575f80fd5b6103a3888389016102a2565b935060608701359150808211156103b8575f80fd5b506103c5878288016102a2565b91505092959194509250565b5f82518060208501845e5f920191825250919050565b5f6001820161040457634e487b7160e01b5f52601160045260245ffd5b5060010190565b634e487b7160e01b5f52602160045260245ffd5b5f81518084528060208401602086015e5f602082860101526020601f19601f83011685010191505092915050565b6002811061045d5761045d61040b565b9052565b60208152815160208201525f602083015160e0604084015261048761010084018261041f565b90506040840151601f19808584030160608601526104a5838361041f565b92506060860151915080858403016080860152506104c3828261041f565b9150506080840151600481106104db576104db61040b565b8060a08501525060a08401516104fc60c08501826001600160a01b03169052565b5060c084015161050f60e085018261044d565b509392505050565b5f60208284031215610527575f80fd5b5051919050565b602081525f610540602083018461041f565b939250505056fea26469706673582212200a1be377fe4c22ee2ee166a43bc14dbe035d4d7fa77f3087e1174298f0cd64c464736f6c63430008190033";

    public static final String FUNC_CREATEALERT = "createAlert";

    public static final Event ALERTCREATED_EVENT = new Event("AlertCreated", 
            Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}));
    ;

    @Deprecated
    protected Alerter(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    protected Alerter(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    @Deprecated
    protected Alerter(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    protected Alerter(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public static List<AlertCreatedEventResponse> getAlertCreatedEvents(TransactionReceipt transactionReceipt) {
        List<Contract.EventValuesWithLog> valueList = staticExtractEventParametersWithLog(ALERTCREATED_EVENT, transactionReceipt);
        ArrayList<AlertCreatedEventResponse> responses = new ArrayList<AlertCreatedEventResponse>(valueList.size());
        for (Contract.EventValuesWithLog eventValues : valueList) {
            AlertCreatedEventResponse typedResponse = new AlertCreatedEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse.desc = (String) eventValues.getNonIndexedValues().get(0).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public static AlertCreatedEventResponse getAlertCreatedEventFromLog(Log log) {
        Contract.EventValuesWithLog eventValues = staticExtractEventParametersWithLog(ALERTCREATED_EVENT, log);
        AlertCreatedEventResponse typedResponse = new AlertCreatedEventResponse();
        typedResponse.log = log;
        typedResponse.desc = (String) eventValues.getNonIndexedValues().get(0).getValue();
        return typedResponse;
    }

    public Flowable<AlertCreatedEventResponse> alertCreatedEventFlowable(EthFilter filter) {
        return web3j.ethLogFlowable(filter).map(log -> getAlertCreatedEventFromLog(log));
    }

    public Flowable<AlertCreatedEventResponse> alertCreatedEventFlowable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(ALERTCREATED_EVENT));
        return alertCreatedEventFlowable(filter);
    }

    public RemoteFunctionCall<TransactionReceipt> createAlert(String title, String description, String recipient_Address, String alertType) {
        final Function function = new Function(
                FUNC_CREATEALERT, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Utf8String(title), 
                new org.web3j.abi.datatypes.Utf8String(description), 
                new org.web3j.abi.datatypes.Utf8String(recipient_Address), 
                new org.web3j.abi.datatypes.Utf8String(alertType)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    @Deprecated
    public static Alerter load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new Alerter(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    @Deprecated
    public static Alerter load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new Alerter(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public static Alerter load(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        return new Alerter(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static Alerter load(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return new Alerter(contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public static RemoteCall<Alerter> deploy(Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider, String _queue) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, _queue)));
        return deployRemoteCall(Alerter.class, web3j, credentials, contractGasProvider, BINARY, encodedConstructor);
    }

    public static RemoteCall<Alerter> deploy(Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider, String _queue) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, _queue)));
        return deployRemoteCall(Alerter.class, web3j, transactionManager, contractGasProvider, BINARY, encodedConstructor);
    }

    @Deprecated
    public static RemoteCall<Alerter> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit, String _queue) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, _queue)));
        return deployRemoteCall(Alerter.class, web3j, credentials, gasPrice, gasLimit, BINARY, encodedConstructor);
    }

    @Deprecated
    public static RemoteCall<Alerter> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit, String _queue) {
        String encodedConstructor = FunctionEncoder.encodeConstructor(Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(160, _queue)));
        return deployRemoteCall(Alerter.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, encodedConstructor);
    }

    public static class AlertCreatedEventResponse extends BaseEventResponse {
        public String desc;
    }
}
