package Decorator_Pattern;

public class Mushroom extends ToppingDecorator {
	basePizza bp;
	public Mushroom(basePizza bp) {
		this.bp = bp;
	}
	
	@Override
	public int cost() {
		return bp.cost() + 10;
	}
	

}
