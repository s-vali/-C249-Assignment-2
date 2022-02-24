import First.Airplane;
import Second.Helicopter;
import Second.Quadcopter;
import Third.Multirotor;
import Fourth.UAV;
import Fifth.AgriculturalDrone;
import Fifth.MAV;


public class Driver {
	
	public static void findLeastAndMostExpensiveUAV(Object[] flyingObjectsArray) {
		//.getClass() returns the class type
		//if no UAV exists
		//if only one UAV, then its both the most expensive and cheapest
		//Sort by most expensive to least expensive
		
		//int counter = 0;
		//UAV[] tempoUAVArray;
		int counter = 0;
		int uavNb = 0;
		for(int i = 0; i < flyingObjectsArray.length-1; i++) {
			if((flyingObjectsArray[i].getClass().getSimpleName()).compareToIgnoreCase("UAV") == 0) {
				//counter++;
				for(int j = i+1; j < flyingObjectsArray.length; j++) {
					if((flyingObjectsArray[j].getClass().getSimpleName()).compareToIgnoreCase("UAV") == 0) {
						UAV currentFlyingObj = (UAV)flyingObjectsArray[i];
						UAV nextFlyingObj = (UAV)flyingObjectsArray[j];
						
						if(nextFlyingObj.getPrice() > currentFlyingObj.getPrice()) {
							Object[] tempoArr = new Object[1];
							tempoArr[0] = flyingObjectsArray[i];
							flyingObjectsArray[i] = flyingObjectsArray[j];
							flyingObjectsArray[j] = tempoArr[0];
							
						}						
					}
					
				}
				
				/*
				if((flyingObjectsArray[i-1].getClass().getSimpleName()).compareToIgnoreCase("UAV") == 0) {
					UAV currentFlyingObj = (UAV)flyingObjectsArray[i-1];
					UAV nextFlyingObj = (UAV)flyingObjectsArray[i];
					
					System.out.println(currentFlyingObj.getPrice());
					
					if(nextFlyingObj.getPrice() > currentFlyingObj.getPrice()) {
						
					}
					
				}
				*/
				
				
				
				
			
				
				
				
				
				
				//System.out.println(flyingObjectsArray[i].toString());
				//counter++;
				//tempoUAVArray = new UAV[counter];
				//Create copy array for UAV only and cast Object to UAV			
			}
		}		
		
		/*
		 * for(int i = 1; i < flyingObjectsArray.length; i++) {

			UAV currentFlyingObj = (UAV)flyingObjectsArray[i-1];
			UAV nextFlyingObj = (UAV)flyingObjectsArray[i];
			if(nextFlyingObj.getPrice() > currentFlyingObj.getPrice()) {
				
				//Putting object at the location in array
				tempoUAVArray[0] = currentFlyingObj;
				flyingObjectsArray[i-1] = nextFlyingObj;
				flyingObjectsArray[i] = currentFlyingObj;
			}
			
		}
		*/
		
		for(int k = 0; k < flyingObjectsArray.length; k++) {
			if((flyingObjectsArray[k].getClass().getSimpleName()).compareToIgnoreCase("UAV") == 0) {
				counter++;
			}
		}
		UAV[] tempoUAVArray = new UAV[counter];	
		for(int l = 0; l < flyingObjectsArray.length; l++ ) {
			if((flyingObjectsArray[l].getClass().getSimpleName()).compareToIgnoreCase("UAV") == 0) {
				uavNb++;
				
				if(uavNb == 1) {
					System.out.println("The highest priced UAV: " + flyingObjectsArray[l].toString());
				}
				if(uavNb == counter) {
					System.out.println("The lowest priced UAV: " + flyingObjectsArray[l].toString());
				}
				if(uavNb == 0) {
					System.out.println("There are no UAV's in this array");
				}
		}

			
			/*
			
			for(int l = k+1; l < flyingObjectsArray.length; l++) {
				if((flyingObjectsArray[k].getClass().getSimpleName()).compareToIgnoreCase("UAV") == 0) {
					counter++;
				
					UAV uavFlyingObj = (UAV) flyingObjectsArray[k];
					if()
				}
				
				//max and min value
			}
			*/
		}
			
			
			
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * 15 OBJECTS
		 */
		//Airplane Class
		Airplane airplane1 = new Airplane("airplaneBrand", 1, 2);
		Airplane airplane2 = new Airplane();
		//Helicopter Class
		Helicopter helicopter1 = new Helicopter();
		Helicopter helicopter2 = new Helicopter("helciopterBrand", 3, 4, 5, 2022, 6);
		//Quadcopter Class
		Quadcopter quadcopter1 = new Quadcopter("quadcopterBrand", 7, 8, 9,2021, 10, 11);
		Quadcopter quadcopter2 = new Quadcopter();
		Quadcopter quadcopter3 = new Quadcopter(quadcopter2);
		//Multirotor Class
		Multirotor multirotor1 = new Multirotor("MultirotorBrand", 12, 13, 14, 2022, 15, 16);
		Multirotor multirotor2 = new Multirotor();
		
		//UAV Class
		UAV uav1 = new UAV();
		UAV uav2 = new UAV();
		UAV uav3 = new UAV(340.0, 1500.0);
		//MAV Class
		MAV mav1 = new MAV();
		MAV mav2 = new MAV(100, 500, "DJI Mini", 20.0);
		//AgriculturalDrone Class
		AgriculturalDrone agriD1  = new AgriculturalDrone();
		AgriculturalDrone agriD2 = new AgriculturalDrone(89.0, 2000.0, "AgriDBrand", 30);
		
		/*
		 * ARRAY OF FLYING OBJECTS #1
		 */
		Object[] flyingObjectsArray1 = { airplane1, airplane2, 
				helicopter1, helicopter2, 
				quadcopter1, quadcopter2, quadcopter3, 
				multirotor1, multirotor2,
				uav1, uav2, uav3,
				mav1, mav2,
				agriD1, agriD2
				};
		
		/*
		 * ARRAY OF FLYING OBJECTS #2 - NO UAV CLASSES
		 */
		Object[] flyingObjectsArray2 = { airplane1, airplane2, 
				helicopter1, helicopter2, 
				quadcopter1, quadcopter2, quadcopter3, 
				multirotor1, multirotor2,
				new Airplane("Canada Dry Air", 4000000000.0, 50),
				new Helicopter("HeliAir", 380000.0, 25, 2, 2016, 6),
				new Quadcopter("QuadAir", 40000.0, 13, 1, 2020, 2, 80),
				new Multirotor("MultiRotorAir", 5460.0, 76, 4, 2017, 1, 4),
				new Multirotor("MultiRotorAir", 5460.0, 76, 4, 2017, 1, 4),
				new Airplane("Stellar Airlines", 5000.0, 28)
				};
		
		/*
		 * PRINT OBJECT INFO BY TOSTRING()
		 */
		for(int i = 0; i < flyingObjectsArray1.length; i++) {
			System.out.println(flyingObjectsArray1[i].toString());
			System.out.println();
		}
		
		/*
		 * TEST EQUALS() METHOD
		 */
		System.out.println("Does Quadcopter 2 equal Quadcopter 3? " + quadcopter2.equals(quadcopter3));
		System.out.println("Does UAV 1 equal UAV 2? " + uav1.equals(uav2));
		System.out.println("Does Multirotor 1 equal Multirotor 2? " + multirotor1.equals(multirotor2));
		System.out.println("Does Airplane 2 equal MAV 1? " + airplane2.equals(mav1));
		System.out.println("Does Agricultural Drone 1 equal Agricultural Drone 2? " + agriD1.equals(agriD2));
		System.out.println("Does Airplane 1 equal Airplane 1? " + airplane1.equals(airplane1));
		System.out.println("Does Airplane 1 equal Helicopter 2? " + airplane1.equals(helicopter2));
		
		
		System.out.println();System.out.println();
		Driver.findLeastAndMostExpensiveUAV(flyingObjectsArray1);
		
		
		// -------------------------------------------------------------------------------------------------------------------------------------------
		//OBJECTS
		/*
		AgriculturalDrone test1 = new AgriculturalDrone(7, 100, "agriTest", 4);
		AgriculturalDrone test5 = new AgriculturalDrone(7, 100, "agriTest", 4);
		UAV uav1 = new UAV (3, 4);
		MAV test4 = new MAV();
		Airplane airplane1 = new Airplane();
		Quadcopter quadcopter1 = new Quadcopter();
		Multirotor multirotor1 = new Multirotor();
		*/

		//System.out.println("The class is: " + test1.getClass() + ", and the super(param) is: " + test1.getPrice() + ", " + test1.getWeight());
		//System.out.println("The class is: " + test2.getClass() + ", and the regular/not super(param) is: " + test2.getPrice() + ", " + test2.getWeight());

		//System.out.println("test1.equals(test2): " + test1.equals(test2));
		
		/*
		System.out.println("test1.equals(test5): " + test1.equals(test5));
		System.out.println("test1.equals(test4): " + test1.equals(test4));
		
		System.out.println(uav1.toString());
		System.out.println(test1.toString());
		System.out.println(test5.toString());
		System.out.println(test4.toString());
		System.out.println(airplane1.toString());
		System.out.println();
		System.out.println(helicopter1.toString());
		System.out.println();
		System.out.println(quadcopter1.toString());
		System.out.println();
		System.out.println(multirotor1);
		*/
		
		//Test if two MAV are equal using the super.equals inside the equals method
	

		/*
		System.out.println("mav1.equals(mav1): " + mav1.equals(mav1));
		System.out.println("mav1.equals(mav2): " + mav1.equals(mav2));
		System.out.println("mav1.equals(mav3): " + mav1.equals(mav3));
		System.out.println("mav2.equals(mav3): " + mav2.equals(mav3));
		
		//Test if two Helicopters are equal using the super but super takes obj as parameter instead
		Helicopter helicopter2 = new Helicopter();
		Helicopter helicopter3 = new Helicopter("brand" , 90.0, 7, 1, 2, 3);
		System.out.println("hel1.equals(helicopter1): " + helicopter1.equals(helicopter1));
		System.out.println("hel1.equals(hel2): " + helicopter1.equals(helicopter2));
		System.out.println("helicopter1.equals(helicopter3): " + helicopter1.equals(helicopter3));
		System.out.println("helicopter2.equals(helicopter3): " + helicopter2.equals(helicopter3));

		//TEST NEW SUPER FOR EACH CONSTRUCTOR
		
		System.out.println();
		System.out.println(airplane1);
		System.out.println();
		System.out.println(helicopter4);
		System.out.println();
		System.out.println(quadcopter1);
		System.out.println();
		System.out.println(multirotor1);
		*/

	}

}
