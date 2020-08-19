/*Rida Abdulwasay       
CIS 35A Section 00450
Assignment 6
Due: 3/21/20
Submitted:3/21/20 */

package driver;

import exception.StudentGradingException;
import model.*;
import util.FileIO;

public class Driver2 {
	public static void main(String[] args) {		
		String filename = "filenotfound"; 
		// If filename is wrong, you are prompted to enter the filename (healed exception)
		Student[] students = new Student[40];
		int[] lowScores = new int[40];
		int[] highScores = new int[40];
		float[] avgScores = new float[40];
				Util util = new Util();
				boolean isFixed = false;
				do {
					try {
						// Populate the student array by calling the readFile function in Util class
						students = util.readFile(filename, students);
						// If filename is wrong, code will stop on line above
						isFixed = true;
					} catch (StudentGradingException e) {
						// Line below will prompt you to provide the new/correct file path
						filename = e.FileNotFound();
					}
				} while (isFixed == false);
				// Create a Statistics object
				StudentStats stat = new StudentStats();
				
				// Find the high scores
				do {
					try {
						// Pass an array of Students and find the high scores
						highScores = stat.findHigh(students);
						// If isFixed = true, the loop will quit and no exceptions raised
						isFixed = true;
					} catch (StudentGradingException e) {
						// This block is executed because the exception is caught
						// but not fixed here. A custom exception is created and automatically
						// solved in StudentStats. "StudentGradingException(Student stu)"
						isFixed = false;
					}
				} while (isFixed == false);

				// Find the low scores
				do {
					try {
						// Pass an array of Students and find the low scores
						lowScores = stat.findLow(students);
						isFixed = true;
					} catch (StudentGradingException e) {
					}
				} while (isFixed == false);

				// Find the avg scores
				do {
					try {
						// Pass an array of Students and find the low scores
						avgScores = stat.findAvg(students);
						isFixed = true;
					} catch (StudentGradingException e) {
					}
				} while (isFixed == false);
				
				
				// Now we must build an array of StudentGrade
				StudentGrade[] StudentGrades = new StudentGrade[40];
				FileIO fileIO = new FileIO();
				for (int i = 0; i < 40 && students[i] != null; i++) {
					StudentGrades[i] = new StudentGrade(students[i].getSID(), students[i].getScores(), highScores[i], lowScores[i], avgScores[i]);
					fileIO.Serialize(StudentGrades[i]);
					StudentGrade stugrad = fileIO.DeSerialize();
					
					System.out.printf("Student ID: %d ", stugrad.getSID());
					System.out.printf("Scores {");
					for (int j = 0; j < stugrad.getScores().length; j++) {
						System.out.printf("%d ", stugrad.getScores()[j]);
					}
					System.out.printf("} ");
					System.out.printf("High: %d ", stugrad.getHigh());
					System.out.printf("Low: %d ", stugrad.getLow());
					System.out.printf("Average: %.2f\n", stugrad.getAvg());
				}
				
	}
}

/* Self-healing software. If you remove a student entry in the middle of StudData.txt, the program asks you to fill in the info for that entry and creates that entry

Invalid filename. Please enter a valid filename/directory such as (StudData.txt): StudData.txt


Error: Missing Student! You must create a new student entry!
Enter Student ID: 1938

--Enter Scores--

Score for quiz 1:12

Score for quiz 2:50

Score for quiz 3:90

Score for quiz 4:32

Score for quiz 5:0
SID: 1234 Scores {78 83 87 91 86 } High: 91 Low: 78 Average: 85.00
SID: 2134 Scores {67 77 84 82 79 } High: 84 Low: 67 Average 77.80
SID: 1938 Scores {12 50 90 32 0 } High: 90 Low: 0 Average: 36.80
SID: 1852 Scores {77 89 93 87 71 } High: 93 Low: 71 Average: 83.40

(For Req 1 and 2. Check logs in ExceptionLogs.txt in the folder as well as the binary files (ends in .dat))
*/

