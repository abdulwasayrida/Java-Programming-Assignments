
//Rida Abdulwasay 
//CIS 35A  Section 00450
//Assignment 0 
//Part 2
//Due: 1/15/20
//Submitted: 1/14/20

import java.util.Scanner; 
public class Part2_Assignment_0 {

	public static void main(String[] args) {
	
		//Centigrade --> Fahrenheit 
		Scanner input = new Scanner(System.in); 
		System.out.printf("Enter Temperature Reading in Centigrade:"); 
		int temp1 = input.nextInt(); 
		
		int fahrenhite = 32 + (temp1 * 180/100); 
		System.out.printf("%d degrees Centigrade is %d degrees Fahrenheit", temp1, fahrenhite); 
		
		//Fahrenheit --> Centigrade 
		System.out.printf("\n\nEnter Temperature Reading in Fahrenheit:"); 
		int temp2 = input.nextInt(); 
		int celsius = (temp2 - 32) * 5/9;
		System.out.printf("%d degrees Fahrenheit is %d degrees Centigrade", temp2, celsius); 
			
	}

}

/* Test Runs
 * Run 1:
Enter Temperature Reading in Centigrade:-10
-10 degrees Centigrade is 14 degrees Fahrenheit

Enter Temperature Reading in Fahrenheit:23
23 degrees Fahrenheit is -5 degrees Centigrade

* Run 2: 
Enter Temperature Reading in Centigrade:50
50 degrees Centigrade is 122 degrees Fahrenheit

Enter Temperature Reading in Fahrenheit:-4
-4 degrees Fahrenheit is -20 degrees Centigrade 

*/