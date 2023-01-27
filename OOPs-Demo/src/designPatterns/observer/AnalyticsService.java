package designPatterns.observer;

public class AnalyticsService implements OrderPlacedSubscriber{
    public AnalyticsService() {
        Amazon a = Amazon.getInstance();
        a.registerOrderPlacedSubscriber(this);
    }

    @Override
    public ReturnData orderPlaceEvent() {
        ReturnData r = new ReturnData("Consuming analytics");
        System.out.println("Analytics subscriber -> consuming analytics");
        return r;
    }
}
