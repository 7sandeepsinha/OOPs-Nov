package designPatterns.observer;

public class SellerNotifier implements OrderPlacedSubscriber{

    public SellerNotifier() {
        Amazon a = Amazon.getInstance();
        a.registerOrderPlacedSubscriber(this);
    }

    @Override
    public ReturnData orderPlaceEvent() {
        ReturnData r = new ReturnData("Notifying seller");
        System.out.println("SellerNotifier listener -> notifying seller");
        return r;
    }
}
