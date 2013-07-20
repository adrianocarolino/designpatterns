package designpatterns.observer.model;

import java.util.ArrayList;
import java.util.Iterator;

import designpatterns.observer.events.OrderEvent;

public class Source {
	
	private ArrayList<OrderListener> listeners;
	
	public Source() {
		listeners = new ArrayList<OrderListener>(); 
	}
	
	public void addListener(OrderListener listener) {
		listeners.add(listener);
	}
	
	public void removeListener(OrderListener listener) {
		listeners.remove(listener);
	}

	public void notifyAllListeners() {
		Iterator<OrderListener> it = listeners.iterator();
		while (it.hasNext()) {			
			OrderListener listener = (OrderListener) it.next();
			listener.customerPaid(new OrderEvent());
		}
	}
}
