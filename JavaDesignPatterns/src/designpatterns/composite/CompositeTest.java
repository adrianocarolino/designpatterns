package designpatterns.composite;

import org.junit.Test;

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
