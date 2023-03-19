package Decorator_Pattern;

public class ExtraCheese extends ToppingDecorator {

	basePizza bp;
	public ExtraCheese(basePizza bp) {
		this.bp= bp;
	}
	@Override
	public int cost() {
		return bp.cost() + 15;
	}

}
