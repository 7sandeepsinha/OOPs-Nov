package designPatterns.observer;

public class CustomerNotifier implements OrderPlacedSubscriber{
    public CustomerNotifier() {
        Amazon a = Amazon.getInstance();
        a.registerSubscriber(this);
    }

    @Override
    public ReturnData orderPlaceEvent() {
        ReturnData r = new ReturnData("Notifying customer");
        System.out.println("Customer notifier -> notifying customer");
        return r;
    }
}
