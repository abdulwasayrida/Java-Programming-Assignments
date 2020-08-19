package Exercise_2;

public class Ship {

    // Declare Instance variables

	// Basic Info
	private String name;
	private String origin;
	private String owner;
	private boolean floating;
	// Dimensions
	private int capacity;
	private float length;
	private float width;
	private float height;
	// Dates
	private String departureDate;
	private String arrivalDate;
	private int departingPortNumber;
	private int arrivalPortNumber;

	// Default Constructor
	public Ship() {
	}

	// Constructor
	public Ship(String name, String origin, String owner, boolean floating, int capacity, float length,
			float width, float height, String departureDate, String arrivalDate, int departingPortNumber,
			int arrivalPortNumber) {
		
		this.name = name;
		this.origin = origin;
		this.owner = owner;
		this.floating = floating;

		this.capacity = capacity;
		this.length = length;
		this.width = width;
		this.height = height;

		this.departureDate = departureDate;
		this.arrivalDate = arrivalDate;
		this.departingPortNumber = departingPortNumber;
		this.arrivalPortNumber = arrivalPortNumber;
	}

	// Print Method
	public void print() {
		System.out.printf("\n------------Printing Data------------\n");
		System.out.printf("Name: %s\n", name);
		System.out.printf("Origin: %s\n", origin);
		System.out.printf("Owner: %s\n", owner);
		System.out.printf("Floating: %b\n", floating);

		System.out.printf("Capacity: %d people\n", capacity);
		System.out.printf("Length: %.2f meters\n", length);
		System.out.printf("Width: %.2f meters\n", width);
		System.out.printf("Height: %.2f meters\n", height);

		System.out.printf("Departure Date: %s\n", departureDate);
		System.out.printf("Arrival Date: %s\n", arrivalDate);
		System.out.printf("Departing Port Number: %d\n", departingPortNumber);
		System.out.printf("Arrival Port Number: %d\n", arrivalPortNumber);
	}


	// Getters and Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public boolean isFloating() {
		return floating;
	}

	public void setFloating(boolean floating) {
		this.floating = floating;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public float getLength() {
		return length;
	}

	public void setLength(float length) {
		this.length = length;
	}

	public float getWidth() {
		return width;
	}

	public void setWidth(float width) {
		this.width = width;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public String getDepartureDate() {
		return departureDate;
	}

	public void setDepartureDate(String departureDate) {
		this.departureDate = departureDate;
	}

	public String getArrivalDate() {
		return arrivalDate;
	}

	public void setArrivalDate(String arrivalDate) {
		this.arrivalDate = arrivalDate;
	}

	public int getDepartingPortNumber() {
		return departingPortNumber;
	}

	public void setDepartingPortNumber(int departingPortNumber) {
		this.departingPortNumber = departingPortNumber;
	}

	public int getArrivalPortNumber() {
		return arrivalPortNumber;
	}

	public void setArrivalPortNumber(int arrivalPortNumber) {
		this.arrivalPortNumber = arrivalPortNumber;
	}

}
