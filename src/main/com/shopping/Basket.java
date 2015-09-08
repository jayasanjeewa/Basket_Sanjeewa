package com.shopping;

public interface Basket {
	
	/**
	 * 
	 * @return calculated total
	 */
	public double calculateTotalCost();
	
	/**
	 * 
	 * @param fruit
	 *  Fruit to add to the basket
	 */
	public void addItem(Fruit fruit);	
	
	/**
	 * 
	 * @param fruit
	 * Fruit to remove from basket
	 */
	public void removeItem(Fruit fruit);

}
