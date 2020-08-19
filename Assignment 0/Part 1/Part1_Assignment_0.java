import java.util.Scanner; 
public class Part1_Assignment_0 {

	public static void main(String[] args) {

		//Get the input for each variable
		Scanner input = new Scanner(System.in); 
		
		System.out.printf("How many TV's were sold?"); 
		int num_TV = input.nextInt(); 
		
		System.out.printf("How many VCR's were sold?"); 
		int num_VCR = input.nextInt(); 
		
		System.out.printf("How many remote controller's were sold?"); 
		int num_RC = input.nextInt(); 
		
		System.out.printf("How many CD's were sold?"); 
		int num_CD = input.nextInt(); 
		
		System.out.printf("How many Tape Recorders were sold?"); 
		int num_TR= input.nextInt(); 

		//Declare variables for Unit Price
		double TVP = 400; double VCRP = 220; double RCP = 35.20; double CDP = 300; double TRP = 150;
		
		//Declare variables for Unit Price
		double TPTV = TVP * num_TV; double TPVCR = VCRP * num_VCR; double TPRC = RCP * num_RC; 
		double TPCD = CDP * num_CD; double TPTR = TRP * num_TR; 
		
		
		//Print the Menu 
		System.out.println("\nQTY\tDESCRIPTION\t\tUNIT PRICE\tTOTAL PRICE"); 
		System.out.println("---------------------------------------------------------------");
		System.out.printf("%d\tTV\t\t\t$%.2f\t\t$%.2f\n", num_TV, TVP, TPTV);
		System.out.printf("%d\tVCR\t\t\t$%.2f\t\t$%.2f\n", num_VCR, VCRP, TPVCR);
		System.out.printf("%d\tRemote Controllers\t$%.2f\t\t$%.2f\n", num_RC, RCP, TPRC);
		System.out.printf("%d\tVCD\t\t\t$%.2f\t\t$%.2f\n", num_CD, CDP, TPCD);
		System.out.printf("%d\tTape Recorders\t\t$%.2f\t\t$%.2f\n", num_TR, TRP, TPTR);
		
	
//Print the Summary
		double SUBTOTAL = (TPTV + TPVCR + TPRC + TPCD + TPTR);
		System.out.printf("\nSUBTOTAL: $%.2f", SUBTOTAL); 
		double TAX = (0.0825 * SUBTOTAL);
		System.out.printf("\n     Tax: $%.2f", TAX); 
		double TOTAL = (SUBTOTAL + TAX); 
		System.out.printf("\n   TOTAL: $%.2f", TOTAL); 

	}

}

/* Test Runs Output 
 
Set 1: 
 
How many TV's were sold?2
How many VCR's were sold?1
How many remote controller's were sold?4
How many CD's were sold?1
How many Tape Recorders were sold?2

QTY	DESCRIPTION			UNIT PRICE	TOTAL PRICE
---------------------------------------------------------------
2	TV					$400.00		$800.00
1	VCR					$220.00		$220.00
4	Remote Controllers	$35.20		$140.80
1	VCD					$300.00		$300.00
2	Tape Recorders		$150.00		$300.00

SUBTOTAL: $1760.80
     Tax: $145.27
   TOTAL: $1906.07
   
______________________________________________________________________
 
Set 2:  

How many TV's were sold?3
How many VCR's were sold?0
How many remote controller's were sold?2
How many CD's were sold?0
How many Tape Recorders were sold?21

QTY	DESCRIPTION			UNIT PRICE	TOTAL PRICE
---------------------------------------------------------------
3	TV					$400.00		$1200.00
0	VCR					$220.00		$0.00
2	Remote Controllers	$35.20		$70.40
0	VCD					$300.00		$0.00
21	Tape Recorders		$150.00		$3150.00

SUBTOTAL: $4420.40
     Tax: $364.68
   TOTAL: $4785.08
 
   
 */

