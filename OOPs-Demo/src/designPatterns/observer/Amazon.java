package designPatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class Amazon {
    List<OrderPlacedSubscriber> orderPlacedSubscribers = new ArrayList<>();
    List<OrderCancelledSubscriber> orderCancelledSubscribers = new ArrayList<>();
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

    public void registerOrderPlacedSubscriber(OrderPlacedSubscriber orderPlacedSubscriber){
        orderPlacedSubscribers.add(orderPlacedSubscriber);
    }

    public void unregisterOrderPlacedSubscriber(OrderPlacedSubscriber orderPlacedSubscriber){
        orderPlacedSubscribers.remove(orderPlacedSubscriber);
    }

    public void registerOrderCancelledSubscriber(OrderCancelledSubscriber orderCancelledSubscriber){
        orderCancelledSubscribers.add(orderCancelledSubscriber);
    }

    public void unregisterOrderCancelledSubscriber(OrderCancelledSubscriber orderCancelledSubscriber){
        orderCancelledSubscribers.remove(orderCancelledSubscriber);
    }


    public void orderPlaceEvent(){
        // using a facade
        // scmNotifier.notifySCM();
        // sellerNotifier.notifySeller();
        // customerNotifier.notifyCustomer();
        // analyticsService.consumeAnalytics();
        // paymentNotifier.notifyForPayment();
        // if we use facade, we wont be able to add/remove subscribers on runtime
        for(OrderPlacedSubscriber o : orderPlacedSubscribers){
            o.orderPlaceEvent();
        }
    }

    public void orderCancelEvent(){
        for(OrderCancelledSubscriber o : orderCancelledSubscribers){
            o.orderCancelledEvent();
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

// break -> 8:35 AM