import First.Airplane;
import Second.Helicopter;
import Second.Quadcopter;
import Third.Multirotor;
import Fourth.UAV;

import java.lang.reflect.Constructor;

import Fifth.AgriculturalDrone;
import Fifth.MAV;

public class Driver2 {

	public static void copyFlyingObjects(Object[] arrayToCopy) {
		
		Object[] copyArray = new Object[arrayToCopy.length];
		
		for (int i =0; i < arrayToCopy.length; i++) {
			//copyArray = (Object[]) (arrayToCopy[i]); //added cast of (Object[]) to the copyArray of type Object
			//System.out.println(copyArray[i].getClass());	
			
			String className = arrayToCopy[i].getClass().getSimpleName();
			System.out.println(className);
			
			
			switch(className) {
				case "Airplane": copyArray[i] = new Airplane(arrayToCopy[i]); break;
				case "Helicopter": copyArray[i] = new Helicopter(arrayToCopy[i]); break;
				case "Quadcopter": copyArray[i] = new Quadcopter(arrayToCopy[i]); break; 
				case "Multirotor": copyArray[i] = new Multirotor(arrayToCopy[i]); break; 
				case "UAV": copyArray[i] = new UAV(arrayToCopy[i]); break;
				case "MAV": copyArray[i] = new MAV(arrayToCopy[i]); break;
				case "AgriculturalDrone": copyArray[i] = new AgriculturalDrone(arrayToCopy[i]); break;
				default: System.out.println("The program failed. Program will terminate."); System.exit(0);
			}//end of switch
			
			
			
			
			
			
			
			
			Object ex = arrayToCopy[i].getClass();
			System.out.println(ex.toString());
			
			copyArray[i] = (Object)arrayToCopy[i]; //Now the reference for each flying object is held within the array but the info isnt copied for each object
			Airplane airplane1 = new Airplane(copyArray[i]);
			
			//downcast into the constructor for each object?
			
			/*
			Object[] copyArray2 = new Object[copyArray.length + 1];
			System.arraycopy(copyArray, 0, copyArray2, 0, copyArray.length);
			copyArray2[copyArray.length] = ex;
			*/
		}
		
		for(int i = 0; i < copyArray.length; i++) {
			System.out.println(copyArray[i].toString());
		}
		
		
		
		//Create copy array of type Object
		//Object[] copyArray = new Object[arrayToCopy.length];
		/*
		for(int i = 0; i < copyArray.length; i++) {
			
			//upcasting
			//Object obj = getObject();
			
			Object castedObjFromArrayToCopy = (Object)arrayToCopy[i];
			
			//cast child to object and then run the casted child to Object obkect to be in the copy/object array
			
			copyArray[i] = 0;//new arrayToCopy[i].getClass()(arrayToCopy[i]);
		*/
		}

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Object[] flyingObjectsArray2 = { 
				new Airplane("Canada Dry Air", 4000000000.0, 50),
				new Helicopter("HeliAir", 380000.0, 25, 2, 2016, 6),
				new Quadcopter("QuadAir", 40000.0, 13, 1, 2020, 2, 80),
				new Multirotor("MultiRotorAir", 5460.0, 76, 4, 2017, 1, 4),
				new Multirotor("MultiRotorAir", 5460.0, 76, 4, 2017, 1, 4),
				new Airplane("Stellar Airlines", 5000.0, 28)
				};
				
		copyFlyingObjects(flyingObjectsArray2);
		
	}

}
