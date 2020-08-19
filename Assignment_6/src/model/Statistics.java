/*Rida Abdulwasay       
CIS 35A Section 00450
Assignment 6
Due: 3/21/20
Submitted:3/21/20 */

package model;

import exception.StudentGradingException;
// Same code from Lab 5 but with exception handling
// This class calculates stats for whole class of Students

public class Statistics {
	// Instance variables
	int[] lowscores = new int[5];
	int[] highscores = new int[5];
	float[] avgscores = new float[5];

	public Statistics() {
		// Default Constructor
	}

	public void findLow(Student[] a) throws StudentGradingException {
		for (int i = 0; i < 5; i++) {
			int minValue = a[0].getScores()[i];
			int j = 1;
			if (a[j] == null) { // Missing Student
				throw new StudentGradingException();
			}
			for (; j < 40 && a[j] != null; j++) {
				if (a[j].getScores()[i] == 0) { // If ever a Student has a null score, you fix it
					throw new StudentGradingException(a[j].getScores()[i]);
				}
				
				if (a[j].getScores()[i] < minValue) {
					minValue = a[j].getScores()[i];
				}
				lowscores[i] = minValue;
			}
		}
	}

	public void findHigh(Student[] a) throws StudentGradingException {
		for (int i = 0; i < 5; i++) {
			int maxValue = a[0].getScores()[i];
			int j = 1;
			if (a[j] == null) { // Missing Student
				throw new StudentGradingException();
			}
			for (; j < 40 && a[j] != null; j++) {
				if (a[j].getScores()[i] == 0) { // If ever a Student has a null score, you fix it
					throw new StudentGradingException(a[j].getScores()[i]);
				}
				if (a[j].getScores()[i] > maxValue) {
					maxValue = a[j].getScores()[i];
				}
				highscores[i] = maxValue;
			}
		}
	}

	public void findavg(Student[] a) throws StudentGradingException {
		for (int i = 0; i < 5; i++) {
			int j = 0;
			if (a[j] == null) { // Missing Student
				throw new StudentGradingException(a[j]);
			}
			while (j < 40 && a[j] != null) {
				if (a[j].getScores()[i] == 0) { // If ever a Student has a null score, you fix it
					throw new StudentGradingException(a[j].getScores()[i]);
				}
				avgscores[i] += a[j].getScores()[i];
				j++;
			}
			avgscores[i] = avgscores[i] / j;
		}

	}

	// Add methods to print values of instance variables.
	public void printHighScores() {
		System.out.printf("High Scores: ");
		for (int i = 0; i < highscores.length; i++) {
			System.out.printf("%d ", highscores[i]);
		}
		System.out.printf("\n");
	}

	public void printLowScores() {
		System.out.printf("Low Scores: ");
		for (int i = 0; i < lowscores.length; i++) {
			System.out.printf("%d ", lowscores[i]);
		}
		System.out.printf("\n");
	}

	public void printAvgScores() {
		System.out.printf("Average Scores: ");
		for (int i = 0; i < avgscores.length; i++) {
			System.out.printf("%.2f ", avgscores[i]);
		}
		System.out.printf("\n");
	}

	
	// Getters and Setters
	public int[] getLowscores() {
		return lowscores;
	}

	public void setLowscores(int[] lowscores) {
		this.lowscores = lowscores;
	}

	public int[] getHighscores() {
		return highscores;
	}

	public void setHighscores(int[] highscores) {
		this.highscores = highscores;
	}

	public float[] getAvgscores() {
		return avgscores;
	}

	public void setAvgscores(float[] avgscores) {
		this.avgscores = avgscores;
	}
}
