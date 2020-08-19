package exception;

import java.io.*;
import java.util.Scanner;

import model.Student;

public class StudentGradingException extends Exception {

	private int errorno;
	private String errormsg;
	private static Scanner sc;

	public StudentGradingException() {
		super();
	}

	public StudentGradingException(Student stu) {
		super();
		MissingStudent(stu);
	}

	public StudentGradingException(int score) {
		super();
		MissingScore(score);
	}
	
	// Requirement 1
	
	public String FileNotFound() {
		errorno = 1;
		// This method fixes file not found exceptions
		sc = new Scanner(System.in);
		System.out.printf("Invalid filename. Please enter a valid filename/directory such as (StudData.txt): ");
		String filename = sc.nextLine();
		errormsg = "Invalid filename/directory. Filename/directory changed to" + filename;
		logException();
		return filename;
	}

	public void MissingStudent(Student stu) {
		// This method takes a Student reference from Driver passed to Statistics passed
		// to StudentGradingException
		// Using that reference, the Student object is modified and the Driver retests
		// this in the do while loop
		errorno = 2;
		System.out.printf("\nError: Missing Student! You must create a new student entry!");
		System.out.printf("\nEnter Student ID: ");
		stu.setSID(sc.nextInt());
		System.out.printf("\n--Enter Scores--\n");
		int[] scores = new int[5];
		for (int i = 0; i < 5; i++) {
			System.out.printf("\nScore for quiz %s:", (i + 1));
			scores[i] = sc.nextInt();
		}
		stu.setScores(scores);
		errormsg = "Missing student error.";
		logException();
	}

	public void MissingScore(int score) {
		errorno = 3;
		System.out.printf("Score is missing or is a 0. Please reinput this quiz's score: ");
		score = sc.nextInt();
		errormsg = "Missing score. Score changed to" + score;
		logException();
	}

	public void logException() {
		// No exception can occur in the following lines as I have already dealt with
		// the issue of an existing file "ExceptionLogs.txt"
		String printStatement = "\nLog: StudentGradingException " + errorno + ": " + errormsg;

		
		
		try {
			File file = new File("ExceptionLogs.txt");
			if (file.exists()) {
				FileWriter fileWriter = new FileWriter("ExceptionLogs.txt", true); // Set true for append mode
				PrintWriter output = new PrintWriter(fileWriter);
				output.println(printStatement);
				output.close();
				
			} else {
				// If the file doesn't exist, the file is created
				PrintWriter output = new PrintWriter(file);
				output.println(printStatement);
				output.close();	
			}
			
		} catch (IOException e) {
			System.out.printf("\nAppend Failed. Quitting Application ...\n");
			System.exit(1);
		}
		
		
		

	}

	public int getErrorno() {
		return errorno;
	}

	public void setErrorno(int errorno) {
		this.errorno = errorno;
	}

	public String getErrormsg() {
		return errormsg;
	}

	public void setErrormsg(String errormsg) {
		this.errormsg = errormsg;
	}
}
