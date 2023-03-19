package Decorator_Pattern;

public class PizzaStore {

	public static void main(String[] args) {
		// create new Margherita pizza
		basePizza pizza = new Margherita();
		System.out.println("Cost : "+ pizza.cost());
		// create new FarmHouse pizza
		basePizza pizza2 = new Farmhouse();
        // decorate it with Mushroom topping
		pizza2 = new Mushroom(pizza2);
        // decorate it with ExtraCheese topping
		pizza2 = new ExtraCheese(pizza2);
		System.out.println("Cost : "+pizza2.cost());
	}

}
