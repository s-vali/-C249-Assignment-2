package Second;

public class Quadcopter extends Helicopter {

	protected int maxFlyingSpeed;
	
	/**
	 * Constructors
	 */	
	//default
	public Quadcopter() {
		this.brand = "Parrot Anafi";
		this.price = 449.0;
		this.horsepower = 20;
		this.nbOfCylinders = 4;
		this.creationYear = 2021;
		this.passengerCapacity = 4;
		this.maxFlyingSpeed = 60;
	}
	//parameterized
	public Quadcopter(String brand, double price, int horsepower, int nbOfCylinders, int creationYear, int passengerCapacity, int maxFlyingSpeed) {
		super(brand, price, horsepower, nbOfCylinders, creationYear, passengerCapacity);
		this.maxFlyingSpeed = maxFlyingSpeed;
	}
	//copy
	public Quadcopter(Object o) {
		Quadcopter copy = (Quadcopter)o;
		this.brand = copy.brand;
		this.price = copy.price;
		this.horsepower = copy.horsepower;
		this.nbOfCylinders = copy.nbOfCylinders;
		this.creationYear = copy.creationYear;
		this.passengerCapacity = copy.passengerCapacity;
		this.maxFlyingSpeed = copy.maxFlyingSpeed;
	}
	/**
	 * Getters and Setters
	 * @return
	 */
	public int getMaxFlyingSpeed() {
		return maxFlyingSpeed;
	}
	public void setMaxFlyingSpeed(int maxFlyingSpeed) {
		this.maxFlyingSpeed = maxFlyingSpeed;
	}
	
	/**
	 * toString()
	 * @return
	 */
	public String toString() {
		return super.toString()
				+ "Its maximum flying speed is " + maxFlyingSpeed + "km/h. ";
	}
	
	/**
	 * equals()
	 * @return boolean
	 */
	@Override
	public boolean equals(Object o) {
		Quadcopter obj = (Quadcopter) o; //obj should have all the attributes of o
		if(super.equals(obj) & this.maxFlyingSpeed == obj.maxFlyingSpeed)
			return true;
		else
			return false;
	}
	
}
