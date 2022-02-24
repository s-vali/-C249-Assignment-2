package Fifth;

import Fourth.UAV;

public class MAV extends UAV {

	/**
	 * Variables
	 */
	protected String model;
	protected double size;
	
	/**
	 * Constructors
	 */
	//default
	public MAV() {
		this.weight = 100;
		this.price = 500;
		this.model = "DJI Mini";
		this.size = 20.0;
	}
	//parametrized
	public MAV(double weight, double price, String model, double size) {
		super(weight, price);
		this.model = model;
		this.size = size;
	}
	//copy
	public MAV(Object o) {
		MAV copy = (MAV)o;
		this.weight = copy.weight;
		this.price = copy.price;
		this.model = copy.model;
		this.size = copy.size;
	}
	
	/**
	 * Getters and Setters
	 * @return
	 */
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public double getSize() {
		return size;
	}
	public void setSize(double size) {
		this.size = size;
	}
	
	/**
	 * toString()
	 * @return 
	 */
	@Override
	public String toString() {
		return super.toString()
				+ "Additionally, it is the model " + this.model 
				+ " of size " + this.size + ". ";
	}
	
	/**
	 * Equals()
	 */
	@Override
	public boolean equals(Object o) {
		MAV obj = (MAV) o;
		if(super.equals(obj) & (this.model.compareToIgnoreCase(obj.model)) == 0 & this.size == obj.size)
			return true;
		else
			return false;
	}
}
