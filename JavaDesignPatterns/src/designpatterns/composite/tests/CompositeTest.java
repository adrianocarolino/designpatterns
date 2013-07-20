package designpatterns.composite.tests;

import org.junit.Test;

import designpatterns.composite.A;
import designpatterns.composite.BODY;
import designpatterns.composite.HEAD;
import designpatterns.composite.HTML;

public class CompositeTest {

	@Test(expected=RuntimeException.class)
	public void testCompositeErrors() {
		HTML html = new HTML();
		HEAD head = new HEAD();
		head.addChild(html);
	}
	
	@Test
	public void testComposite() {
		HTML html = new HTML();
		HEAD head = new HEAD();
		BODY body = new BODY();
		A a = new A();
		html.addChild(head);
		html.addChild(body);
		body.addChild(a);
	}

}
