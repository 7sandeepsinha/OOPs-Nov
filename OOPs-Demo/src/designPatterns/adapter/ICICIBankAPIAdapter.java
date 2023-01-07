package designPatterns.adapter;

import designPatterns.adapter.thirdparty.banks.ICICIApi;

public class ICICIBankAPIAdapter implements BankAPIAdapter{

    private ICICIApi iciciApi;

    public ICICIBankAPIAdapter() {
        this.iciciApi = new ICICIApi();
    }

    @Override
    public float checkBalance(String accountNo, String pin) {
        //write logic to check balance using ICICIAPI
        return 0;
    }

    @Override
    public boolean authenticate(String accountNo, String pin) {
        //write logic to authenticate using ICICIAPI
        return false;
    }

    @Override
    public boolean transaction(String fromAccountNo, String toAccountNo) {
        //write logic to do transaction using ICICI API
        return false;
    }
}
