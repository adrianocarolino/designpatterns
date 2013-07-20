package designpatterns.strategy;

public class Div implements Strategy {

	@Override
	public double execute(int a, int b) {
		return ((double) a / (double) b) ;
	}

}
