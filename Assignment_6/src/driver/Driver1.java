package driver;

import exception.StudentGradingException;
import model.*;

public class Driver1 {
	public static void main(String[] args) {
		System.out.printf("Welcome to the De Anza Student ID System\n\n");
		Student students[] = new Student[40];
		Util util = new Util();

		boolean isFixed = false;
		String filename = "filedoesnotexist.txt";

		do {
			try {
				// Populate the student array
				students = util.readFile(filename, students);
				// If filename is wrong, code will stop on line above
				isFixed = true;
			} catch (StudentGradingException e) {
				filename = e.FileNotFound();
			}
		} while (isFixed == false);

		for (int i = 0; i < students.length && students[i] != null; i++) {
			students[i].printSID();
			students[i].printScores();
			System.out.printf("\n");
		}

		Statistics stat = new Statistics();
		// Calculate highest and lowest scores and store them in an array in Statistics
		
		// If any score is null, you will be prompted to enter the student's scores
		// If a student record is missing, you will be prompted to create a new student record
		isFixed = false; 

		do {
			try {
				stat.findHigh(students);
				stat.printHighScores();
				isFixed = true;
			} catch (StudentGradingException e) {
				// The missing Student is already fixed by passing reference of a Student form
				// Statistics into
				// a custom exception with an overloaded constructor
			}

		} while (isFixed == false);

		do {
			try {
				stat.findLow(students);
				stat.printLowScores();
				isFixed = true;
			} catch (StudentGradingException e) {
			}
		} while (isFixed == false);

		do {
			try {
				stat.findavg(students);
				stat.printAvgScores();
				isFixed = true;
			} catch (StudentGradingException e) {
			}
		} while (isFixed == false);
	}
}
