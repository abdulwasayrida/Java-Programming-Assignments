//Rida Abdulwasay   
//CIS 35A  Section 00450
//Assignment 1
//Part 2
//Due: 1/24/20
//Submitted: 


import java.util.Scanner; 
public class Assignment_1_Part_2 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); 
		System.out.printf("Enter a number:"); 
		long n = input.nextLong();  
		double square = sqrt(n); 
		System.out.printf("The square root of %d is %.2f", n, square); 
		
	}

	
//sqrt Method 
	
	public static double sqrt(long n) 
	{
	double lastGuess = 1; double nextGuess; //Initialize the first guess as 1
	nextGuess = (lastGuess + n / lastGuess) / 2; 
	
	
	while ((Math.abs(nextGuess - lastGuess) >  0.0001)) { //use Absolute value function to get precise answers 
		lastGuess = nextGuess;
		nextGuess = (lastGuess + n / lastGuess) / 2; 
		}
	return nextGuess; 
	}
	
	}



/*Test Runs
  
Enter a number:121
The square root of 121 is 11.00

Enter a number: 65536
The square root of 65536 is 256.00
  
Enter a number:135
The square root of 135 is 11.62  
  
  */
