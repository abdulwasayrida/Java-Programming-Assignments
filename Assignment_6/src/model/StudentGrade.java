/*Rida Abdulwasay       
CIS 35A Section 00450
Assignment 6
Due: 3/21/20
Submitted:3/21/20 */

package model;

import java.io.Serializable;

public class StudentGrade implements Serializable{
	private int SID;
	private int[] scores;
	private int high;
	private int low;
	private float avg;
	public StudentGrade(int SID, int[] scores, int high, int low, float avg) {
		this.SID = SID;
		this.scores = scores;
		this.high = high;
		this.low = low;
		this.avg = avg;	
	}
	public int getSID() {
		return SID;
	}
	public void setSID(int sID) {
		SID = sID;
	}
	public int[] getScores() {
		return scores;
	}
	public void setScores(int[] scores) {
		this.scores = scores;
	}
	public int getHigh() {
		return high;
	}
	public void setHigh(int high) {
		this.high = high;
	}
	public int getLow() {
		return low;
	}
	public void setLow(int low) {
		this.low = low;
	}
	public float getAvg() {
		return avg;
	}
	public void setAvg(float avg) {
		this.avg = avg;
	}
}
