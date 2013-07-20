package designpatterns.observer.model;

import designpatterns.observer.events.OrderEvent;

public interface OrderListener {
	
	public void customerPaid(OrderEvent event);

}
