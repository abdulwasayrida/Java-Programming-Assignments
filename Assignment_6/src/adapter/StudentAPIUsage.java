package adapter;

import exception.StudentGradingException;
import model.*;
import util.FileIO;

public class StudentAPIUsage extends StudentAPIImpl implements StudentAPI {
	// Instance Variables
	private String filename;
	private Student[] students = new Student[40];
	private int[] lowscores = new int[40];
	private int[] highscores = new int[40];
	private float[] avgscores = new float[40];
	private FileIO fileIO = new FileIO();

	public StudentAPIUsage(String filename) {
		super(filename);
		this.filename = filename;
		// Reused code from Driver2
		// Does all the work and stores results in arrays and serialized files
		Util util = new Util();
		boolean isFixed = false;
		do {
			try {
				this.students = util.readFile(filename, students);
				isFixed = true;
			} catch (StudentGradingException e) {
				filename = e.FileNotFound();
			}
		} while (isFixed == false);
		StudentStats stat = new StudentStats();
		do {
			try {
				this.highscores = stat.findHigh(students);
				isFixed = true;
			} catch (StudentGradingException e) {
				isFixed = false;
			}
		} while (isFixed == false);
		do {
			try {
				this.lowscores = stat.findLow(students);
				isFixed = true;
			} catch (StudentGradingException e) {
			}
		} while (isFixed == false);
		do {
			try {
				this.avgscores = stat.findAvg(students);
				isFixed = true;
			} catch (StudentGradingException e) {
			}
		} while (isFixed == false);
		StudentGrade[] StudentGrades = new StudentGrade[40];
		for (int i = 0; i < 40 && students[i] != null; i++) {
			StudentGrades[i] = new StudentGrade(students[i].getSID(), students[i].getScores(), highscores[i],
					lowscores[i], avgscores[i]);
			fileIO.Serialize(StudentGrades[i]);
		}
	}

	public void printstats() {

		StudentGrade stugrad = fileIO.DeSerialize();
		System.out.printf("Stats for SID %d: ", stugrad.getSID());
		System.out.printf("{High: %d}", stugrad.getHigh());
		System.out.printf("{Low: %d}", stugrad.getLow());
		System.out.printf("{Avg: %.2f}\n", stugrad.getAvg());
	}


	public void printscores(int SID) {
		String fname = "STU" + SID + ".dat";
		fileIO.setFilename(fname);
		StudentGrade stugrad = fileIO.DeSerialize();
		System.out.printf("Scores for SID %d:  ", stugrad.getSID());
		for (int i = 0; i < 5; i++) {
			System.out.printf("%d ", stugrad.getScores()[i]);
		}
		System.out.printf("\n");

	}

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public Student[] getStudents() {
		return students;
	}

	public void setStudents(Student[] students) {
		this.students = students;
	}

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

	public FileIO getFileIO() {
		return fileIO;
	}

	public void setFileIO(FileIO fileIO) {
		this.fileIO = fileIO;
	}

	

}
