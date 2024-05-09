package org.web3j.generated.contracts;

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
public class Queue extends Contract {
    public static final String BINARY = "6080604052348015600e575f80fd5b506111818061001c5f395ff3fe608060405234801561000f575f80fd5b506004361061004a575f3560e01c8063615f834a1461004e5780636553a3bf1461006c578063957908d114610074578063b406cce21461008a575b5f80fd5b61005661009d565b6040516100639190610c16565b60405180910390f35b610056610331565b61007c6105bb565b604051908152602001610063565b61007c610098366004610e00565b610b00565b60606001805480602002602001604051908101604052809291908181526020015f905b82821015610328578382905f5260205f2090600502016040518060e00160405290815f82015481526020016001820180546100fa90610eeb565b80601f016020809104026020016040519081016040528092919081815260200182805461012690610eeb565b80156101715780601f1061014857610100808354040283529160200191610171565b820191905f5260205f20905b81548152906001019060200180831161015457829003601f168201915b5050505050815260200160028201805461018a90610eeb565b80601f01602080910402602001604051908101604052809291908181526020018280546101b690610eeb565b80156102015780601f106101d857610100808354040283529160200191610201565b820191905f5260205f20905b8154815290600101906020018083116101e457829003601f168201915b5050505050815260200160038201805461021a90610eeb565b80601f016020809104026020016040519081016040528092919081815260200182805461024690610eeb565b80156102915780601f1061026857610100808354040283529160200191610291565b820191905f5260205f20905b81548152906001019060200180831161027457829003601f168201915b5050509183525050600482015460209091019060ff1660038111156102b8576102b8610bee565b60038111156102c9576102c9610bee565b8152600482015461010081046001600160a01b03166020830152604090910190600160a81b900460ff16600181111561030457610304610bee565b600181111561031557610315610bee565b81525050815260200190600101906100c0565b50505050905090565b60605f805480602002602001604051908101604052809291908181526020015f905b82821015610328578382905f5260205f2090600502016040518060e00160405290815f820154815260200160018201805461038d90610eeb565b80601f01602080910402602001604051908101604052809291908181526020018280546103b990610eeb565b80156104045780601f106103db57610100808354040283529160200191610404565b820191905f5260205f20905b8154815290600101906020018083116103e757829003601f168201915b5050505050815260200160028201805461041d90610eeb565b80601f016020809104026020016040519081016040528092919081815260200182805461044990610eeb565b80156104945780601f1061046b57610100808354040283529160200191610494565b820191905f5260205f20905b81548152906001019060200180831161047757829003601f168201915b505050505081526020016003820180546104ad90610eeb565b80601f01602080910402602001604051908101604052809291908181526020018280546104d990610eeb565b80156105245780601f106104fb57610100808354040283529160200191610524565b820191905f5260205f20905b81548152906001019060200180831161050757829003601f168201915b5050509183525050600482015460209091019060ff16600381111561054b5761054b610bee565b600381111561055c5761055c610bee565b8152600482015461010081046001600160a01b03166020830152604090910190600160a81b900460ff16600181111561059757610597610bee565b60018111156105a8576105a8610bee565b8152505081526020019060010190610353565b5f80546105c6575f80fd5b5f805f815481106105d9576105d9610f23565b905f5260205f2090600502016040518060e00160405290815f820154815260200160018201805461060990610eeb565b80601f016020809104026020016040519081016040528092919081815260200182805461063590610eeb565b80156106805780601f1061065757610100808354040283529160200191610680565b820191905f5260205f20905b81548152906001019060200180831161066357829003601f168201915b5050505050815260200160028201805461069990610eeb565b80601f01602080910402602001604051908101604052809291908181526020018280546106c590610eeb565b80156107105780601f106106e757610100808354040283529160200191610710565b820191905f5260205f20905b8154815290600101906020018083116106f357829003601f168201915b5050505050815260200160038201805461072990610eeb565b80601f016020809104026020016040519081016040528092919081815260200182805461075590610eeb565b80156107a05780601f10610777576101008083540402835291602001916107a0565b820191905f5260205f20905b81548152906001019060200180831161078357829003601f168201915b5050509183525050600482015460209091019060ff1660038111156107c7576107c7610bee565b60038111156107d8576107d8610bee565b8152600482015461010081046001600160a01b03166020830152604090910190600160a81b900460ff16600181111561081357610813610bee565b600181111561082457610824610bee565b905250905060015b5f54811015610966575f818154811061084757610847610f23565b905f5260205f2090600502015f6001836108619190610f37565b8154811061087157610871610f23565b5f9182526020909120825460059092020190815560018082019061089790840182610fa8565b506002818101906108aa90840182610fa8565b506003818101906108bd90840182610fa8565b50600482810154908201805460ff9092169160ff191660018360038111156108e7576108e7610bee565b02179055506004828101805491830180546001600160a01b036101009485900416909302610100600160a81b0319841681178255915460ff600160a81b918290041693919260ff60a81b1916610100600160b01b0319909216919091179083600181111561095757610957610bee565b0217905550505060010161082c565b505f8054806109775761097761107d565b5f8281526020812060055f19909301928302018181559061099b6001830182610b6e565b6109a8600283015f610b6e565b6109b5600383015f610b6e565b5060040180546001600160b01b03191690559055600160c08201819052805480820182555f9190915281517fb10e2d527612073b26eecdfd717e6a320cf44b4afac2b0732d9fcbe2b7fa0cf66005909202918201908155602083015183927fb10e2d527612073b26eecdfd717e6a320cf44b4afac2b0732d9fcbe2b7fa0cf70190610a409082611091565b5060408201516002820190610a559082611091565b5060608201516003820190610a6a9082611091565b50608082015160048201805460ff19166001836003811115610a8e57610a8e610bee565b021790555060a08201516004820180546001600160a01b0390921661010002610100600160a81b031983168117825560c08501519260ff60a81b19909116610100600160b01b031990911617600160a81b836001811115610af157610af1610bee565b0217905550505f549392505050565b5f8054600181018255818052825160059091027f290decd9548b62a8d60345a988386fc84ba6bc95484008f6362f93160ef3e563810191825560208401518492917f290decd9548b62a8d60345a988386fc84ba6bc95484008f6362f93160ef3e5640190610a409082611091565b508054610b7a90610eeb565b5f825580601f10610b89575050565b601f0160209004905f5260205f2090810190610ba59190610ba8565b50565b5b80821115610bbc575f8155600101610ba9565b5090565b5f81518084528060208401602086015e5f602082860101526020601f19601f83011685010191505092915050565b634e487b7160e01b5f52602160045260245ffd5b60028110610c1257610c12610bee565b9052565b5f60208083018184528085518083526040925060408601915060408160051b8701018488015f5b83811015610cf557603f19898403018552815160e08151855288820151818a870152610c6b82870182610bc0565b9150508782015185820389870152610c838282610bc0565b91505060608083015186830382880152610c9d8382610bc0565b9250505060808083015160048110610cb757610cb7610bee565b9086015260a0828101516001600160a01b03169086015260c09182015191610ce181870184610c02565b509588019593505090860190600101610c3d565b509098975050505050505050565b634e487b7160e01b5f52604160045260245ffd5b60405160e0810167ffffffffffffffff81118282101715610d3a57610d3a610d03565b60405290565b5f82601f830112610d4f575f80fd5b813567ffffffffffffffff80821115610d6a57610d6a610d03565b604051601f8301601f19908116603f01168101908282118183101715610d9257610d92610d03565b81604052838152866020858801011115610daa575f80fd5b836020870160208301375f602085830101528094505050505092915050565b803560048110610dd7575f80fd5b919050565b80356001600160a01b0381168114610dd7575f80fd5b803560028110610dd7575f80fd5b5f60208284031215610e10575f80fd5b813567ffffffffffffffff80821115610e27575f80fd5b9083019060e08286031215610e3a575f80fd5b610e42610d17565b82358152602083013582811115610e57575f80fd5b610e6387828601610d40565b602083015250604083013582811115610e7a575f80fd5b610e8687828601610d40565b604083015250606083013582811115610e9d575f80fd5b610ea987828601610d40565b606083015250610ebb60808401610dc9565b6080820152610ecc60a08401610ddc565b60a0820152610edd60c08401610df2565b60c082015295945050505050565b600181811c90821680610eff57607f821691505b602082108103610f1d57634e487b7160e01b5f52602260045260245ffd5b50919050565b634e487b7160e01b5f52603260045260245ffd5b81810381811115610f5657634e487b7160e01b5f52601160045260245ffd5b92915050565b601f821115610fa357805f5260205f20601f840160051c81016020851015610f815750805b601f840160051c820191505b81811015610fa0575f8155600101610f8d565b50505b505050565b818103610fb3575050565b610fbd8254610eeb565b67ffffffffffffffff811115610fd557610fd5610d03565b610fe981610fe38454610eeb565b84610f5c565b5f601f82116001811461101a575f83156110035750848201545b5f19600385901b1c1916600184901b178455610fa0565b5f8581526020808220868352908220601f198616925b838110156110505782860154825560019586019590910190602001611030565b508583101561106d57818501545f19600388901b60f8161c191681555b5050505050600190811b01905550565b634e487b7160e01b5f52603160045260245ffd5b815167ffffffffffffffff8111156110ab576110ab610d03565b6110b981610fe38454610eeb565b602080601f8311600181146110ec575f84156110d55750858301515b5f19600386901b1c1916600185901b178555611143565b5f85815260208120601f198616915b8281101561111a578886015182559484019460019091019084016110fb565b508582101561113757878501515f19600388901b60f8161c191681555b505060018460011b0185555b50505050505056fea26469706673582212203835dcaf54feab8f0595acc0f16ec794df3ebab2497dc530e8da5b050334272564736f6c63430008190033";

    public static final String FUNC_DEQUEUE = "dequeue";

    public static final String FUNC_ENQUEUE = "enqueue";

    public static final String FUNC_LIST_ALL_OPENALERTS = "list_All_OpenAlerts";

    public static final String FUNC_LIST_ALL_RESPONDED_ALERTS = "list_All_Responded_Alerts";

    @Deprecated
    protected Queue(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    protected Queue(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    @Deprecated
    protected Queue(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    protected Queue(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteFunctionCall<TransactionReceipt> dequeue() {
        final Function function = new Function(
                FUNC_DEQUEUE, 
                Arrays.<Type>asList(), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<TransactionReceipt> enqueue(Alert alert) {
        final Function function = new Function(
                FUNC_ENQUEUE, 
                Arrays.<Type>asList(alert), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteFunctionCall<List> list_All_OpenAlerts() {
        final Function function = new Function(FUNC_LIST_ALL_OPENALERTS, 
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

    public RemoteFunctionCall<List> list_All_Responded_Alerts() {
        final Function function = new Function(FUNC_LIST_ALL_RESPONDED_ALERTS, 
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

    @Deprecated
    public static Queue load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new Queue(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    @Deprecated
    public static Queue load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new Queue(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public static Queue load(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        return new Queue(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static Queue load(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return new Queue(contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public static RemoteCall<Queue> deploy(Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        return deployRemoteCall(Queue.class, web3j, credentials, contractGasProvider, BINARY, "");
    }

    @Deprecated
    public static RemoteCall<Queue> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(Queue.class, web3j, credentials, gasPrice, gasLimit, BINARY, "");
    }

    public static RemoteCall<Queue> deploy(Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return deployRemoteCall(Queue.class, web3j, transactionManager, contractGasProvider, BINARY, "");
    }

    @Deprecated
    public static RemoteCall<Queue> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(Queue.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, "");
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