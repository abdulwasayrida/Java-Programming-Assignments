package util;
import java.io.*;  

import model.StudentGrade;
 
public class FileIO {
	private String filename;
	private ObjectOutputStream out;
	private ObjectInputStream in;

	public FileIO() {

	}

	public void Serialize(StudentGrade studgrad) {
		filename = "STU" + Integer.toString(studgrad.getSID()) + ".dat"; // Requirement 2

		try {
			out = new ObjectOutputStream(new FileOutputStream(filename));
			out.writeObject(studgrad);
		} catch (Exception e) {
			System.out.printf("Cannot Serialize");
		}
	}

	public StudentGrade DeSerialize() {
		try {
			in = new ObjectInputStream(new FileInputStream(filename));
			StudentGrade stugrad = (StudentGrade) in.readObject();
			
			return stugrad;
			
			/*
			System.out.printf("SID: %d ", stugrad.getSID());
			System.out.printf("Scores{");
			for (int i = 0; i < stugrad.getScores().length; i++) {
				System.out.printf("%d ", stugrad.getScores()[i]);
			}
			System.out.printf("} ");
			System.out.printf("H: %d ", stugrad.getHigh());
			System.out.printf("L: %d ", stugrad.getLow());
			System.out.printf("A: %.2f\n", stugrad.getAvg());
			*/
		} catch (Exception e) {
			System.out.printf("Cannot DeSerialize");
			return null;
		}
		
	}

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public ObjectOutputStream getOut() {
		return out;
	}

	public void setOut(ObjectOutputStream out) {
		this.out = out;
	}

	public ObjectInputStream getIn() {
		return in;
	}

	public void setIn(ObjectInputStream in) {
		this.in = in;
	}


}
