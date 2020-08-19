package model;

public class Student {
	// Instance Variables
	private int SID;
	private int scores[] = new int[5];

	// Default Constructor
	public Student() {
	}

	// Overloaded Constructor
	public Student(int SID, int scores[]) {
		this.SID = SID;
		this.scores = scores;
	}

	// Public Getter and Setter methods
	public int getSID() {
		return SID;
	}

	public void setSID(int SID) {
		this.SID = SID;
	}

	public int[] getScores() {
		return scores;
	}

	public void setScores(int[] scores) {
		this.scores = scores;
	}

	// Print methods
	public void printSID() {
		System.out.printf("SID: %d\n", SID);
	}

	public void printScores() {
		System.out.printf("Scores: ");
		for (int i = 0; i < scores.length; i++) {
			System.out.printf("%d ", scores[i]);
		}
		System.out.printf("\n");
	}
}
