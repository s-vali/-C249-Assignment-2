package Second;

import First.Airplane;

public class Helicopter extends Airplane {
	
	protected int nbOfCylinders;
	protected int creationYear;
	protected int passengerCapacity;
	
	/**
	 * Constructors
	 */
	//default
	public Helicopter() {
		this.brand = "Sikorsky";
		this.price = 250000.0;
		this.horsepower = 20;
		this.nbOfCylinders = 4;
		this.creationYear = 2019;
		this.passengerCapacity = 6;
	}
	//parameterized
	public Helicopter(String brand, double price, int horsepower, int nbOfCylinders, int creationYear, int passengerCapacity) {
		super(brand, price, horsepower);
		this.nbOfCylinders = nbOfCylinders;
		this.creationYear = creationYear;
		this.passengerCapacity = passengerCapacity;
	}
	//copy
	public Helicopter(Object o) {
		Helicopter copy = (Helicopter)o;
		this.brand = copy.brand;
		this.price = copy.price;
		this.horsepower = copy.horsepower;
		this.nbOfCylinders = copy.nbOfCylinders;
		this.creationYear = copy.creationYear;
		this.passengerCapacity = copy.passengerCapacity;
	}
	
	/**
	 * Getters and Setters
	 * @return
	 */
	public int getNbOfCylinders() {
		return nbOfCylinders;
	}
	public void setNbOfCylinders(int nbOfCylinders) {
		this.nbOfCylinders = nbOfCylinders;
	}
	public int getCreationYear() {
		return creationYear;
	}
	public void setCreationYear(int creationYear) {
		this.creationYear = creationYear;
	}
	public int getPassengerCapacity() {
		return passengerCapacity;
	}
	public void setPassengerCapacity(int passengerCapacity) {
		this.passengerCapacity = passengerCapacity;
	}
	
	/**
	 * toString()
	 * @return
	 */
	@Override
	public String toString() {
		return super.toString()
				+ "Additionally, it was created in " + creationYear + ". "
				+ "It holds " + passengerCapacity + " passengers "
				+ "and has " + nbOfCylinders + " number of clyninders. ";
	}
	
	/**
	 * equals()
	 * @return boolean
	 */
	@Override
	public boolean equals(Object o) {
		Helicopter obj = (Helicopter) o; //obj should have all the attributes of o
		if(super.equals(obj) & this.nbOfCylinders == obj.nbOfCylinders & this.creationYear == obj.creationYear & this.passengerCapacity == obj.passengerCapacity)
			return true;
		else
			return false;
	}
	
	
	
	
	
}
