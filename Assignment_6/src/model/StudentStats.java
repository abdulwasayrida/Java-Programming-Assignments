/*Rida Abdulwasay       
CIS 35A Section 00450
Assignment 6
Due: 3/21/20
Submitted:3/21/20 */

package model;

import exception.StudentGradingException;

public class StudentStats {
	// This class calculates stats for each Student

	public StudentStats() {
		// Default Constructor
	}

	public int[] findLow(Student[] a) throws StudentGradingException {
		int[] lowScores = new int[40];

		for (int i = 0; i < 40 && a[i] != null; i++) {

			// If a student record in between is null, we can fix it
			if (a[i] == null && a[i + 1] != null) { // Missing Student
				throw new StudentGradingException();
			}
			int j = 1;
			int minValue = a[i].getScores()[0];
			for (; j < 5; j++) {
				if (a[i].getScores()[j] < minValue) {
					minValue = a[i].getScores()[j];
				}
				lowScores[i] = minValue;
			}
		}
		return lowScores;
	}

	public int[] findHigh(Student[] a) throws StudentGradingException {
		int[] highScores = new int[40];
		for (int i = 0; i < 40 && a[i] != null; i++) {
			int j = 1;
			// If a student record in between is null, we can fix it
			if (a[i].getScores()[j] == 0 && a[i + 1].getScores()[j] != 0) {
				// Missing Student if the ID in between records is missing
				throw new StudentGradingException(a[i]);
			}
			int maxValue = a[i].getScores()[0];
			for (; j < 5; j++) {
				if (a[i].getScores()[j] > maxValue) {
					maxValue = a[i].getScores()[j];
				}
				highScores[i] = maxValue;
			}
		}
		return highScores;
	}

	public float[] findAvg(Student[] a) throws StudentGradingException {
		float[] avgScores = new float[40];

		for (int i = 0; i < 40 && a[i] != null; i++) {
			int j = 0;
			// If a student record in between is null, we can fix it
			if (a[i].getScores()[j] == 0 && a[i + 1].getScores()[j] != 0) {
				// Missing Student if the ID in between records is missing
				throw new StudentGradingException(a[i]);
			}
			while (j < 5) {
				avgScores[i] += a[i].getScores()[j];
				j++;
			}
			avgScores[i] = avgScores[i] / j;
		}

		return avgScores;
	}

}
