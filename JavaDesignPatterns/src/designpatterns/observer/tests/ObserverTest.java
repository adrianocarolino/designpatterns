package designpatterns.observer.tests;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Test;

import designpatterns.observer.model.Shop;
import designpatterns.observer.model.Source;

public class ObserverTest {

	@Test
	public void testMyObserver() {
		Source source = new Source();
		Shop shop =  new Shop();
		source.addListener(shop);
		source.notifyAllListeners();
		//Assert.assertEquals();
	}

}
