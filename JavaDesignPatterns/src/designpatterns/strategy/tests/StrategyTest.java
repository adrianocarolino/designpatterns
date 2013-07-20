package designpatterns.strategy.tests;

import org.junit.Test;

import designpatterns.strategy.Add;
import designpatterns.strategy.Context;
import designpatterns.strategy.Multiply;
import designpatterns.strategy.Subtract;

public class StrategyTest {

	@Test
	public void testStrategyPattern() {
		Context context;
		 
        // Three contexts following different strategies
        context = new Context(new Add());
        int resultA = context.executeStrategy(3, 4);
 
        context = new Context(new Subtract());
        int resultB = context.executeStrategy(3, 4);
 
        context = new Context(new Multiply());
        int resultC = context.executeStrategy(3, 4);
 
        System.out.println("Result A : " + resultA );
        System.out.println("Result B : " + resultB );
        System.out.println("Result C : " + resultC );
	}

}
