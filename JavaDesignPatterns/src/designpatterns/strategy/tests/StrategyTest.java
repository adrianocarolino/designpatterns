package designpatterns.strategy.tests;

import junit.framework.Assert;

import org.junit.Test;

import designpatterns.strategy.Add;
import designpatterns.strategy.Context;
import designpatterns.strategy.Div;
import designpatterns.strategy.Multiply;
import designpatterns.strategy.Subtract;

public class StrategyTest {

	private Context context;

	@Test
	public void testStrategyPatternAdd() {
		context = new Context(new Add());
		Assert.assertEquals(7.0, context.executeStrategy(3, 4));
	}

	@Test
	public void testStrategyPatternSubtract() {
		Context context;
		context = new Context(new Subtract());
		Assert.assertEquals(-1.0, context.executeStrategy(3, 4));
	}

	@Test
	public void testStrategyMultiply() {
		context = new Context(new Multiply());
		Assert.assertEquals(12.0, context.executeStrategy(3, 4));
	}
	
	@Test
	public void testStrategyDiv() {
		context = new Context(new Div());
		Assert.assertEquals(0.75, context.executeStrategy(3, 4));
	}
	

}
