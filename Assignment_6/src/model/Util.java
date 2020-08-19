/*Rida Abdulwasay       
CIS 35A Section 00450
Assignment 6
Due: 3/21/20
Submitted:3/21/20 */

package model;

import java.io.*;  
import java.util.*;
// I had to import the exception StudentGradingException
import exception.StudentGradingException;

public class Util {
	// This class is straight from Lab 5
	// Instance variable
	private boolean DEBUG = false;

	// Default Constructor
	public Util() {
	}

	public Student[] readFile(String filename, Student[] students) throws StudentGradingException {
		int counter = 0; // Records number of lines reading
		int num = 0; // Keeps record of student entry
		try {
			FileReader file = new FileReader(filename);
			BufferedReader buff = new BufferedReader(file);
			boolean eof = false;
			while (!eof) {
				String line = buff.readLine();
				counter++;
				if (line == null)
					eof = true;
				else {
					if (DEBUG) {
						// Prints data out when DEBUG is on
						System.out.printf("%s\n", line);
					}
					if (counter == 1) {
						// Do nothing (line 1 is header)
					} else if (counter > 1 && counter < 41) {
						StringTokenizer str = new StringTokenizer(line);
						int s1 = 0;
						int scores[] = new int[5];
						while (str.hasMoreTokens()) {
							// Sets ID's
							s1 = Integer.parseInt(str.nextToken()); // Student ID
							for (int i = 0; i < 5; i++) {
								int s2 = Integer.parseInt(str.nextToken());
								scores[i] = s2;
							}
						}
						students[num] = new Student(s1, scores);
						num++;

					} else if (counter > 1 && counter > 41) {
						// Prints the rest of the data if data is more than 41 lines (1 + 40)
						System.out.printf("%s\n", line);
					}

				}
			}
			buff.close();
		} catch (IOException e) {
			throw new StudentGradingException();
			
			
			
		}
		return students;
	}
}