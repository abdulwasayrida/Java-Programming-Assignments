//Rida Abdulwasay  
//CIS 35A  Section 00450
//Assignment 1
//Part 1
//Due: 1/24/20
//Submitted: 

import java.util.Scanner; 

public class Assignment_1_Part_1 {

	public static void main(String[] args) {
		
		//Get Loan
		Scanner input = new Scanner(System.in); 
		System.out.printf("Loan Amount:");
		double loan = input.nextDouble(); 
		
		//Get Number of years 
		System.out.printf("Number of Years:");
		int years = input.nextInt(); 
		
		//Get Interest Rate 
		System.out.printf("Annual Interest Rate:");
		double annualRate = input.nextDouble(); 
		
		// Calculate monthly interest rate
		double monthlyInterestRate = annualRate / 1200;
		
		//Calculate monthly payment 
	    double monthlyPayment = loan * monthlyInterestRate / (1 - 1 / Math.pow(1 + monthlyInterestRate, years * 12));
	    System.out.printf("\nMonthly Payment: %.2f\n", monthlyPayment);
	    
	    //Calculate Total Payment
	    double totalPayment = monthlyPayment * years * 12;
	    System.out.printf("Total Payment: %.2f\n\n", totalPayment);
	    
	    //Print Table
	    double interest, principal;
	    System.out.printf("Payment#\tInterest\tPrincipal\tBalance\n");
	    
	    
	    for (int i = 1; i <= years * 12; i++) {
	    	   interest = monthlyInterestRate * loan;
	    	   principal = monthlyPayment - interest;
	    	   loan = loan - principal;
	    	   System.out.printf("%d\t\t%.2f\t\t%.2f\t\t%.2f\n", i, interest, principal, loan);
	    	  }
	}

}

/* Test Run Output

Loan Amount:10000
Number of Years:1
Annual Interest Rate:7

Monthly Payment: 865.27
Total Payment: 10383.21

Payment#	Interest	Principal	Balance
1		58.33		806.93		9193.07
2		53.63		811.64		8381.42
3		48.89		816.38		7565.05
4		44.13		821.14		6743.91
5		39.34		825.93		5917.98
6		34.52		830.75		5087.24
7		29.68		835.59		4251.65
8		24.80		840.47		3411.18
9		19.90		845.37		2565.81
10		14.97		850.30		1715.51
11		10.01		855.26		860.25
12		5.02		860.25		0.00

*/