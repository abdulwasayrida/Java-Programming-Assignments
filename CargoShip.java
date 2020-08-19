/*Rida Abdulwasay  
CIS 35A Section 00450
Assignment 4 Exercise 2 
Due: 2/26/20
Submitted: 2/26/20 */

package Exercise_2;

public class CargoShip extends Ship {

	// 5 Additional Instance variables
	private String cargoType;
	private String loadingMethod;
	private int numberOfCranes;
	private boolean contraband;
	private float cargoValue;

	// Default Constructor
	public CargoShip() {
		super();
	}

	// Constructor
	public CargoShip(String name, String origin, String owner, boolean floating, int capacity,
			float length, float width, float height, String departureDate, String arrivalDate, int departingPortNumber,
			int arrivalPortNumber, String cargoType, String loadingMethod, int numberOfCranes, boolean contraband,
			float cargoValue) {

		super(name, origin, owner, floating, capacity, length, width, height, departureDate, arrivalDate,
				departingPortNumber, arrivalPortNumber);
		
		this.cargoType = cargoType;
		this.loadingMethod = loadingMethod;
		this.numberOfCranes = numberOfCranes;
		this.contraband = contraband;
		this.cargoValue = cargoValue;
	}
	
	//Print Method
	public void print() {
		super.print();
		System.out.printf("\n------------Additional Cargo Ship Data------------\n");
		System.out.printf("Cargo Type: %s\n", cargoType);
		System.out.printf("Loading Method %s\n:", loadingMethod);
		System.out.printf("Number Of Cranes: %d\n", numberOfCranes);
		System.out.printf("Contraband: %b\n", contraband);
		System.out.printf("Cargo Value: %.2f\n", cargoValue);
	}

	//Getters and Setters
	public String getCargoType() {
		return cargoType;
	}

	public void setCargoType(String cargoType) {
		this.cargoType = cargoType;
	}

	public String getLoadingMethod() {
		return loadingMethod;
	}

	public void setLoadingMethod(String loadingMethod) {
		this.loadingMethod = loadingMethod;
	}

	public int getNumberOfCranes() {
		return numberOfCranes;
	}

	public void setNumberOfCranes(int numberOfCranes) {
		this.numberOfCranes = numberOfCranes;
	}

	public boolean isContraband() {
		return contraband;
	}

	public void setContraband(boolean contraband) {
		this.contraband = contraband;
	}

	public float getCargoValue() {
		return cargoValue;
	}

	public void setCargoValue(float cargoValue) {
		this.cargoValue = cargoValue;
	}
	
}
