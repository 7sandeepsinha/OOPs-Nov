package designPatterns.adapter;

import designPatterns.adapter.thirdparty.banks.YesBankApi;

public class YesBankAPIAdapter implements BankAPIAdapter{
    private YesBankApi yesBankApi;

    public YesBankAPIAdapter() {
        this.yesBankApi = new YesBankApi();
    }

    @Override
    public float checkBalance(String accountNo, String pin) {
        //check balance using yes bank API
        return 0;
    }

    @Override
    public boolean authenticate(String accountNo, String pin) {
        return false;
    }

    @Override
    public boolean transaction(String fromAccountNo, String toAccountNo) {
        return false;
    }
}
