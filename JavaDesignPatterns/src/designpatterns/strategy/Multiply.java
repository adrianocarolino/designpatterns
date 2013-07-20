package designpatterns.strategy;

public class Multiply implements Strategy {

	@Override
	public double execute(int a, int b) {
        return a * b; 
    }  
}
