package designpatterns.observer.tests;

import org.junit.Test;

import designpatterns.observer.model.Shop;
import designpatterns.observer.model.Source;

public class ObserverTest {

	@Test
	public void testMyObserver() {
		//source generates the event
		Source source = new Source();		
		//listener
		Shop shop =  new Shop();		
		source.addListener(shop);
		source.notifyAllListeners();
	}

}
