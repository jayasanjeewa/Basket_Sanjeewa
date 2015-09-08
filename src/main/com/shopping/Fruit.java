package com.shopping;

/**
 * Abstract class <code>Fruit</code> representing the basic fruit item
 * 
 * @author sjayathi
 *
 */
public abstract class Fruit {

	protected String name = "Fruit";
	protected double cost = 0;

	/**
	 * 
	 * @return String name of the fruit
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * 
	 * @return double cost of the fruit
	 */
	public double getCost() {
		return this.cost;
	}

	/**
	 * Since Fruit is used as a key in a <code> HashMap</code> , it's important
	 * to override hashCode and equals
	 */
	@Override
	public int hashCode() {
		return (int) this.cost * this.name.length();
	}

	@Override
	public boolean equals(Object o) {

		// If the object is not null fruit
		if (o != null && o instanceof Fruit) {
			
			Fruit f = (Fruit) o;
			
			// compare the name and cost 
			if (this.name.equals(f.getName()) && (this.cost - f.getCost()) == 0) {
				return true;
			}
		}

		return false;
	}

}
