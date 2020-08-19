/*Rida Abdulwasay  
CIS 35A Section 00450
Assignment 4 Exercise 2 
Due: 2/26/20
Submitted: 2/26/20 */

package Exercise_2;

public class CruiseShip extends Ship {

	// 5 Additional Instance variables
	private float ticketPrice;
	private int numberOfRooms;
	private String buffetMenu;
	private String services[];
	private String cruiseType;

	// Default Constructor
	public CruiseShip() {
		super();
	}

	// Constructor
	public CruiseShip(String name, String origin, String owner, boolean floating, int capacity,
			float length, float width, float height, String departureDate, String arrivalDate, int departingPortNumber,
			int arrivalPortNumber, float ticketPrice, int numberOfRooms, String buffetMenu, String services[],
			String cruiseType) {

		super(name, origin, owner, floating, capacity, length, width, height, departureDate, arrivalDate,
				departingPortNumber, arrivalPortNumber);

		this.ticketPrice = ticketPrice;
		this.numberOfRooms = numberOfRooms;
		this.buffetMenu = buffetMenu;
		this.services = new String[services.length];
		for (int i = 0; i < services.length; i++) {
			this.services[i] = services[i];
		}
		this.cruiseType = cruiseType;
	}
	
	//Print Method
	public void print() {
		super.print();
		System.out.printf("\n------------Additional Cruise Ship Data------------\n");
		System.out.printf("Ticket Price: $%.2f\n", ticketPrice);
		System.out.printf("Number Of Rooms: %d\n", numberOfRooms);
		System.out.printf("Buffet Menu: %s\n", buffetMenu);
		System.out.printf("Services:");
		for (int i = 0; i < services.length; i++) {
			System.out.printf(" %s ", services[i]);
		}
		System.out.printf("\nCruise Type: %s\n", cruiseType);
	}
	
	//Getters and Setters
	public float getTicketPrice() {
		return ticketPrice;
	}

	public void setTicketPrice(float ticketPrice) {
		this.ticketPrice = ticketPrice;
	}

	public int getNumberOfRooms() {
		return numberOfRooms;
	}

	public void setNumberOfRooms(int numberOfRooms) {
		this.numberOfRooms = numberOfRooms;
	}

	public String getBuffetMenu() {
		return buffetMenu;
	}

	public void setBuffetMenu(String buffetMenu) {
		this.buffetMenu = buffetMenu;
	}

	public String[] getServices() {
		return services;
	}

	public void setServices(String[] services) {
		this.services = services;
	}

	public String getCruiseType() {
		return cruiseType;
	}

	public void setCruiseType(String cruiseType) {
		this.cruiseType = cruiseType;
	}

}
