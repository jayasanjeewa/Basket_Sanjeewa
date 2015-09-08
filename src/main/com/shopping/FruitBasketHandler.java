package com.shopping;

/**
 * This class uses both inheritance and composition
 * This handles a given fruit basket and return the calculated cost
 * 
 * @author sjayathi
 *
 */
public class FruitBasketHandler implements BasketHandler {

	// reference object - basket
	Basket basket;

	/**
	 * 
	 * @param basket
	 *            Basket of fruits
	 */
	public FruitBasketHandler(Basket basket) {

		this.basket = basket;

	}

	/**
	 * handle basket by calculating the cost of all fruits in the basket
	 * 
	 */
	@Override
	public double handleBasket() {

		// Delegate the cost calculation to the basket
		return basket.calculateTotalCost();
	}

}
