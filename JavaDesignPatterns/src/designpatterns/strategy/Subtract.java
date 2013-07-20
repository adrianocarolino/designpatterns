package designpatterns.strategy;

public class Subtract implements Strategy {

	@Override
	public double execute(int a, int b) {
        return a - b; 
    }

}
