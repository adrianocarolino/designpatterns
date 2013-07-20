package designpatterns.observer.model;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Test;

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
