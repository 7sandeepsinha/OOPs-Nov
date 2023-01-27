package designPatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class Amazon {
    List<OrderPlacedSubscriber> orderPlacedSubscribers = new ArrayList<>();
    private static Amazon instance;

    private Amazon() {
    }

    public static Amazon getInstance(){
        if (instance == null) {
            synchronized (Amazon.class){
                if(instance == null){
                    instance = new Amazon();
                }
            }
        }
        return instance;
    }

    public void registerSubscriber(OrderPlacedSubscriber orderPlacedSubscriber){
        orderPlacedSubscribers.add(orderPlacedSubscriber);
    }

    public void unregisterSubscriber(OrderPlacedSubscriber orderPlacedSubscriber){
        orderPlacedSubscribers.remove(orderPlacedSubscriber);
    }

    public void orderPlaceEvent(){
        //using a facade
        // scmNotifier.notify();
        // sellerNotifier.notify();
        // customerNotifier.notify();
        // analyticsService.notify();
        // if we use facade, we wont be able to add/remove subscribers on runtime
        for(OrderPlacedSubscriber o : orderPlacedSubscribers){
            o.orderPlaceEvent();
        }
    }

}

/*
Publisher has 3 major things :
1. List of all subscriber objects
2. Register and unregister method to add/remove subscriber from list
3. Event generation method

a.orderPlaceEvent();
 */