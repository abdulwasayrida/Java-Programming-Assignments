/*Rida Abdulwasay  
CIS 35A Section 00450
Assignment 4 Exercise 1 Part 1 
Due: 2/26/20
Submitted: 2/6/20 */

package Exercise_1_Part_1;

public class SavingsAccount {

	//Declare Instance Variables
	public static double annualInterestRate;
	public double savingsBalance;
	public double monthlyInterest; 
	
	
	//Default Constructor 
	public SavingsAccount(){}
	
	public SavingsAccount(double savingsBalance) {
		this.savingsBalance = savingsBalance;
	}
	
	public void calculateMonthlyInterest () {
		monthlyInterest = (savingsBalance * annualInterestRate/1200); //annualInterestRate is a percent, so it must be divided by 100 too
		savingsBalance +=  monthlyInterest; //savingsBalance = savingsBalance + monthlyInterest
	}
	
	//Modify the Interest Rate
	public static void modifyInterestRate (double annualInterestRate) {
		SavingsAccount.annualInterestRate = annualInterestRate; //Change the annualInterestRate
	}
	
	public void withdraw(double withdrawAmount) {
		savingsBalance -= withdrawAmount; 
	}
	
	public void deposit(double depositAmount) {
		savingsBalance += depositAmount; 
	}

	
	//Getters and Setters
	public static double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public static void setAnnualInterestRate(double annualInterestRate) {
		SavingsAccount.annualInterestRate = annualInterestRate;
	}

	public double getSavingsBalance() {
		return savingsBalance;
	}

	public void setSavingsBalance(double savingsBalance) {
		this.savingsBalance = savingsBalance;
	}

	public double getMonthlyInterest() {
		return monthlyInterest;
	}

	public void setMonthlyInterest(double monthlyInterest) {
		this.monthlyInterest = monthlyInterest;
	}
	
	
}

