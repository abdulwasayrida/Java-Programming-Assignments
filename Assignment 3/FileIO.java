/* Rida Abdulwasay  
CIS 35A Section 00450
Assignment 3 
Due: 2/14/20
Submitted: 2/14/20 */

import java.io.*; 
import java.util.*;

public class FileIO {
	/** file name */
	private String fname = null;
	/** A global boolean variable for debugging */
	private boolean DEBUG = false; // I turned the FileIO debugging off in order to maintain the clarity of the output of my program shown in the console

	/**
	 * Constructor to construct a FileIO object
	 * @param fname is the filename
	 */
	public FileIO(String fname) {
		this.fname = fname; // Set the filename
	}

	/**
	 * Reads a file and creates a franchise
	 * @return a franchise
	 */
	public Franchise readData() {
		Franchise a1 = null; // Used to create franchises after extracting data (initially null)
		int counter = 0; // Counts the number of lines
		try { // Try/Catch block to catch exceptions
			FileReader file = new FileReader(fname); // Create a FileReader with filename fname
			BufferedReader buff = new BufferedReader(file); // Pass the file reader into the BufferedReader
			String temp; // Temp temporarily holds the line to be interpreted
			boolean eof = false; // Stops the file reading when it is the end of file (eof)
			while (!eof) { // While it is not the end of file, do
				String line = buff.readLine(); // Read a line and store it in line
				counter++; // Increase line count
				if (line == null) // If the line is null, it is the end of file
					eof = true; // Set the end of file to true because line is null (no more lines to read)
				else {
					if (DEBUG) // If true, print out the line
						System.out.println("Reading " + line); // Print out line
					if (counter == 1) { // If counter is 1
						temp = line; // Duplicate the line
						a1 = new Franchise(Integer.parseInt(temp)); // Convert string to integer and make a Franchise
						if (DEBUG) // If true, print the number of stores
							System.out.println("d  " + a1.numberofstores());// print the number of stores
					}
					if (counter == 2) // If counter is 2
						; // Do nothing
					if (counter > 2) { // If counter is greater than 2
						int x = buildStore(a1, (counter - 3), line); // Build a store and get the week
						if (DEBUG) // If true, print the number of weeks read
							System.out.println("Reading Store # " + (counter - 2) + " Number of weeks read =  " + x); // Print which store is read and the total number of weeks read
						if (DEBUG) { // If true, print a new line
							System.out.println("Data read...\n"); // Print out that the Data is read
						}
					}
				}
			}
			buff.close(); // Close the buffered reader
		} catch (Exception e) { // Catch if an exception is thrown
			System.out.println("Error -- " + e.toString()); // Print out an error message
		}
		return a1; // Return a Franchise object
	}

	/**
	 * @param a1      is a Franchise
	 * @param counter is the store number
	 * @param temp    is the line to break down/convert into other data type
	 * @return the week
	 */
	public int buildStore(Franchise a1, int counter, String temp) {
		Store tstore = new Store(); // Make a new store called tstore
		String s1 = ""; // Used in parsing a string
		float sale = 0.0f; // Used in parsing the sales
		int week = 0; // Used in calculating the week
		int day = 0; // Used in the for loop
		StringTokenizer st = new StringTokenizer(temp); // create a new StringTokenizer called st
		while (st.hasMoreTokens()) { // While the string has more tokens
			for (day = 0; day < 7; day++) { // Extract data from the line
				s1 = st.nextToken(); // Get the next token
				sale = Float.parseFloat(s1); // Convert it into a float
				tstore.setSaleForWeekdayIntersection(week, day, sale); // Do the calculations on the data
			}
			week++; // Move on to next week
		}
		a1.setStores(tstore, counter); // Set the store in Franchise a1 with current data
		return week; // Return the week
	}
}
