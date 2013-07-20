package designpatterns.strategy;

public class Add implements Strategy {

	@Override
	public double execute(int a, int b) {
        return a + b;
    }

}
