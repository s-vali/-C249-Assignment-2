package Fifth;

import Fourth.UAV;
import java.util.Objects;

public class AgriculturalDrone extends UAV {

	/**
	 * Variables
	 */
	protected String brand;
	protected int carryCapacity;
	
	/**
	 * Constructors
	 */
	//default
	public AgriculturalDrone() {
		this.weight = 340.0;
		this.price = 98000.0;
		this.brand = "AgriDrones";
		this.carryCapacity = 25;	
	}
	//parameterized
	public AgriculturalDrone(double weight, double price, String brand, int carryCapacity) {
		super(weight, price);
		this.brand = brand;
		this.carryCapacity = carryCapacity;	
	}
	//copy
	public AgriculturalDrone(Object o) {
		AgriculturalDrone copy = (AgriculturalDrone)o;
		this.weight = copy.weight;
		this.price = copy.price;
		this.brand = copy.brand;
		this.carryCapacity = copy.carryCapacity;	
	}
	
	/**
	 * Getters and Setters
	 * @return
	 */
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getCarryCapacity() {
		return carryCapacity;
	}
	public void setCarryCapacity(int carryCapacity) {
		this.carryCapacity = carryCapacity;
	}
	
	/**
	 * toString()
	 */
	@Override
	public String toString() {
		return "This " + getClass().getSimpleName() + " is manufactured by " + this.brand 
				+ ". It weighs " + this.weight 
				+ " pounds, and costs " + this.price 
				+ "$. It can carry " + this.carryCapacity + " kg. ";
	}
	
	/**
	 * Equals()
	 */
	@Override
	public boolean equals(Object o) {
		if(o == null) { //if o's reference is null - FIX THIS
			return false;
		} else if(this.getClass() != o.getClass()){ //or (this.getClass() == o.getClass()
			return false;
		}
		else { //object is of the class and not null
			AgriculturalDrone obj = (AgriculturalDrone) o;
			//System.out.println("obj.brand: " + obj.brand + " obj.carryCapacity: " + obj.carryCapacity + " obj.price: " + obj.price);
			if(this.weight == obj.weight & this.price == obj.price & this.carryCapacity == obj.carryCapacity & (this.brand.compareToIgnoreCase(obj.brand)) == 0) {
				return true;
			} else
				return false;
		}
	}

}
