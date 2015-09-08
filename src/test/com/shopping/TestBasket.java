package com.shopping;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestBasket {

	@Before
	public void setUp() {

	}

	/**
	 * A basket of - 2 banana (0.20 * 2 ) - 3 Apples ( - 2 Peaches ( * 2) - 4
	 * Oranges - 3 Lemon
	 * 
	 * 
	 */
	@Test
	public void testTotalCost() {

		// ( 2 * 0.20 + 3 * 0.10 + 2 * 0.25 + 4 * 0.45 + 3 * 0.05 )
		double expectedCost = 3.15;

		// call the method to create the basket
		Basket basket = createTestBasket();

		BasketHandler handler = new FruitBasketHandler(basket);

		double actualCost = handler.handleBasket();

			
		// compare the actual and expected cost
		assertTrue((expectedCost - actualCost) == 0);

	}

	/**
	 * Helper method
	 * 
	 * @return basket - a basket of Fruits
	 */
	private Basket createTestBasket() {
		Basket basket = new FruitBasket();

		// 2 banana
		basket.addItem(new Banana());
		basket.addItem(new Banana());

		// 3 Apples
		basket.addItem(new Apple());
		basket.addItem(new Apple());
		basket.addItem(new Apple());

		// 2 Peaches
		basket.addItem(new Peach());
		basket.addItem(new Peach());

		// 4 Oranges
		basket.addItem(new Orange());
		basket.addItem(new Orange());
		basket.addItem(new Orange());
		basket.addItem(new Orange());

		// 3 Lemon
		basket.addItem(new Lemon());
		basket.addItem(new Lemon());
		basket.addItem(new Lemon());

		return basket;

	}

}
