package designPatterns.adapter;

public class Client {
    public static void main(String[] args) {
        PhonePe phonePe = new PhonePe(new YesBankAPIAdapter());
        /**
         *  Instead of injecting the object directly, what if we create a BankAPI
         *  adapter factory ?
         *  BankAPIAdapterFactory -> create adaptor object and injects into phonepe
         */
    }
}
