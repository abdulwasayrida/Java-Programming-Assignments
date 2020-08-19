/*Rida Abdulwasay       
CIS 35A Section 00450
Assignment 6
Due: 3/21/20
Submitted:3/21/20 */

package driver;

import adapter.StudentAPI;
import adapter.StudentAPIUsage;

public class Driver3 {

	public static void main(String[] args) {
		StudentAPI a1 = new StudentAPIUsage("StudData.txt");
		a1.printstats();
		a1.printscores(1234);

	}

}

/*

For Req 3)
Stats for SID 1852: {High: 93}{Low: 71}{Avg: 83.40}
Scores for SID 1234:  78 83 87 91 86 

*/