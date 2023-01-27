package designPatterns.observer;

public class SCMNotifier implements OrderPlacedSubscriber{

    public SCMNotifier() {
        Amazon a = Amazon.getInstance();
        a.registerOrderPlacedSubscriber(this);
    }

    @Override
    public ReturnData orderPlaceEvent() {
        ReturnData r = new ReturnData("Notifying warehouse, packaging and courier");
        System.out.println("SCMNotifier listener -> notifying SCM");
        return r;
    }
}
