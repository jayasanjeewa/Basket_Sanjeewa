package com.shopping;

import java.util.HashMap;
import java.util.Map;

public class FruitBasket implements Basket {

	//
	Map<Fruit, Integer> fruitItems = new HashMap<Fruit, Integer>();

	/**
	 * @return total value of a Fruit basket
	 */
	public double calculateTotalCost() {

		// variable to hold total cost
		double totalCost = 0;

		// Since fruit items is a map, iterate over the entry set
		// and then calculate cost of particular fruit item by multiplying unit
		// price and quantity
		for (Map.Entry<Fruit, Integer> entry : fruitItems.entrySet()) {

			// Get the unit price
			double unitPrice = entry.getKey().getCost();

			// get the quantity
			int quantity = entry.getValue();

			// Total cost is calculated

			totalCost += unitPrice * quantity;

		}

		return totalCost;

	}

	@Override
	public void addItem(Fruit fruit) {
		if (fruitItems.containsKey(fruit)) {
			fruitItems.put(fruit, fruitItems.get(fruit) + 1);
		} else {
			fruitItems.put(fruit, 1);
		}

	}

	@Override
	public void removeItem(Fruit fruit) {

		if (fruitItems.containsKey(fruit)) {
			if (fruitItems.get(fruit) > 1)
				fruitItems.put(fruit, fruitItems.get(fruit) - 1);
			else
				fruitItems.remove(fruit);
		} else {
			// don't do anything
		}

	}

}
