package Fourth;

import Fifth.AgriculturalDrone;

public class UAV {

	/**
	 * Variables
	 */
	protected double weight;
	protected double price;
	
	/**
	 * Constructor
	 */
	//default
	public UAV() {
		this.weight = 150;
		this.price = 10000.0;
	}
	//parameterized
	public UAV(double weight, double price) {
		this.weight = weight;
		this.price = price;
	}
	//copy
	public UAV(Object o) {
		UAV copy = (UAV)o;
		this.weight = copy.weight;
		this.price = copy.price;
	}
	
	/**
	 * Getters and Setters
	 * @return
	 */
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	/**
	 * toString()
	 */
	public String toString() {
		return "This " + getClass().getSimpleName() + " has a weight of " + weight 
				+ " pounds and costs " + price + "$. ";
	}
	
	/**
	 * 
	 */
	public boolean equals(Object o) {
		if(o == null) { //if o's reference is null - FIX THIS
			return false;
		} else if(this.getClass() != o.getClass()){ //or (this.getClass() == o.getClass()
			return false;
		}
		else { //object is of the class and not null
			UAV obj = (UAV) o;
			//System.out.println("obj.brand: " + obj.brand + " obj.carryCapacity: " + obj.carryCapacity + " obj.price: " + obj.price);
			if(this.weight == obj.weight & this.price == obj.price) {
				return true;
			} else
				return false;
		}
	}
	
}
