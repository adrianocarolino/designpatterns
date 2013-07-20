package designpatterns.strategy;

public class Context {
	private Strategy strategy;
	 
    public Context(Strategy strategy) {
        this.strategy = strategy;
    }
 
    public double executeStrategy(int a, int b) {
        return this.strategy.execute(a, b);
    }
}
