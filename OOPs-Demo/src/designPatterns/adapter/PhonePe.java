package designPatterns.adapter;

public class PhonePe {
    private BankAPIAdapter bankAPI;

    public PhonePe(BankAPIAdapter bankAPI) {
        this.bankAPI = bankAPI;
    }

    public boolean doTransaction(String fromAccountNo, String toAccountNo, int amount, String pin){
        if(bankAPI.authenticate(fromAccountNo, pin)){
            float balance = bankAPI.checkBalance(fromAccountNo, pin);
            if(balance >= amount){
                if(bankAPI.transaction(fromAccountNo, toAccountNo)){
                    return true;
                }
            }
        }
        return false;
    }
}
