/* Rida Abdulwasay 
CIS 35A Section 00450
Assignment 3 
Due: 2/14/20
Submitted: 2/14/20 */

public class Store {
	private float salesByWeek[][]; // Each store contains 2-dimensional array
//	private float totalSalesPerWeek[];// what to do with it?

	/** Instance Variables for Analyze Results */
	private double averageSalesForWeek;
	private double totalSaleForWeek;
	private double totalSalesForAllWeeks;
	private double averageWeeklySales;
	private int weekWithLowestSaleAmount;
	private int weekWithHighestSaleAmount;

	/** Default Constructor */
	Store() {
		salesByWeek = new float[5][7];
	}

	/** Getters and Setters */
	public void setSaleForWeekdayIntersection(int week, int day, float sale) {
		salesByWeek[week][day] = sale;
	}

	float getSalesForEntireWeek(int week) {
		float total = 0;
		for (int i = 0; i < 7; i++) {
			total += salesByWeek[week][i];
		}
		return total;
	}

	float getSaleforWeekdayIntersection(int week, int day) {
		return salesByWeek[week][day];
	}

	public float[][] getSalesByWeek() {
		return salesByWeek;
	}

	public void setSalesByWeek(float[][] salesByWeek) {
		this.salesByWeek = salesByWeek;
	}

	public double getAverageSalesForWeek() {
		return averageSalesForWeek;
	}

	public void setAverageSalesForWeek(double averageSalesForWeek) {
		this.averageSalesForWeek = averageSalesForWeek;
	}

	public double getTotalSaleForWeek() {
		return totalSaleForWeek;
	}

	public void setTotalSaleForWeek(double totalSaleForWeek) {
		this.totalSaleForWeek = totalSaleForWeek;
	}

	public void setTotalSalesForAllWeeks(double totalSalesForAllWeeks) {
		this.totalSalesForAllWeeks = totalSalesForAllWeeks;
	}

	public void setAverageWeeklySales(double averageWeeklySales) {
		this.averageWeeklySales = averageWeeklySales;
	}

	public void setWeekWithLowestSaleAmount(int weekWithLowestSaleAmount) {
		this.weekWithLowestSaleAmount = weekWithLowestSaleAmount;
	}

	public void setWeekWithHighestSaleAmount(int weekWithHighestSaleAmount) {
		this.weekWithHighestSaleAmount = weekWithHighestSaleAmount;
	}

	/** Appropriate Business Methods a-f */
	float getTotalSalesForWeek(int week) {
		float total = 0;

		for (int j = 0; j < 7; j++) {
			total += salesByWeek[week][j];
		}
		return total;
	}

	float getAverageSalesForWeek(int week) {
		return getTotalSalesForWeek(week) / 7;
	}

	float getTotalSalesForAllWeeks() {
		float total = 0;
		for (int j = 0; j < 5; j++) {
			total += getTotalSalesForWeek(j);
		}
		return total;
	}

	float getAverageWeeklySales() {
		return getTotalSalesForAllWeeks() / 5;
	}

	int getWeekWithHighestSaleAmount() {
		float salesForWeek[] = new float[5];
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 7; j++) {
				salesForWeek[i] += salesByWeek[i][j];
			}
		}
		int weekWithHighest;
		weekWithHighest = 0;
		for (int i = 0; i < 5; i++) {
			if (salesForWeek[weekWithHighest] < salesForWeek[i]) {
				weekWithHighest = i + 1;
			}
		}
		return weekWithHighest;
	}

	int getWeekWithLowestSaleAmount() {
		float salesForWeek[] = new float[5];
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 7; j++) {
				salesForWeek[i] += salesByWeek[i][j];
			}
		}
		int weekWithLowest;
		weekWithLowest = 0;
		for (int i = 0; i < 5; i++) {
			if (salesForWeek[weekWithLowest] > salesForWeek[i]) {
				weekWithLowest = i + 1;
			}
		}
		return weekWithLowest;
	}

	/** Call a-f and pre-load into memory */
	public void analyzeResults(int week) {
		averageSalesForWeek = getAverageSalesForWeek(week);
		totalSalesForAllWeeks = getTotalSalesForAllWeeks();
		totalSaleForWeek = getTotalSalesForWeek(week);
		totalSalesForAllWeeks = getAverageWeeklySales();
		averageWeeklySales = getAverageWeeklySales();
		weekWithLowestSaleAmount = getWeekWithLowestSaleAmount();
		weekWithHighestSaleAmount = getWeekWithHighestSaleAmount();
	}

	public void print(int choice) {

		if (choice == 1) {
			for (int i = 0; i < 5; i++) {
				System.out.printf("Total Sales for  Week %d: $%.2f\n", i, getTotalSalesForWeek(i));
			}
		}
		if (choice == 2) {
			for (int i = 0; i < 5; i++) {
				System.out.printf("Average Sales for Week %d: $%.2f\n",i, getAverageSalesForWeek(i));
			}
		}
		if (choice == 3) {
			System.out.printf("Total Sales for All Weeks: $%.2f\n", getTotalSalesForAllWeeks());
		}
		if (choice == 4) {
			System.out.printf("Average Weekly Sales: $%.2f\n", getAverageWeeklySales()); // ?
		}
		if (choice == 5) {
			System.out.printf("Week with the Highest Amount in Sales: Week %d\n", getWeekWithHighestSaleAmount());
		}
		if (choice == 6) {
			System.out.printf("Week with the Lowest Amount in Sales: Week %d\n\n", getWeekWithLowestSaleAmount());
		}
		if (choice == 7) {
			System.out.printf("Total Sales for Each Week\n");
			System.out.printf("--------------------------------\n");
			for (int i = 0; i < 5; i++) {
				System.out.printf("Total Sales for Week %d: $%.2f\n", i, getTotalSalesForWeek(i));
			}
			System.out.printf("\nAverage Sales for Each Week\n");
			System.out.printf("--------------------------------\n");
			for (int i = 0; i < 5; i++) {
				System.out.printf("Average Sales for Week %d: $%.2f\n", i, getAverageSalesForWeek(i));
			}
			System.out.printf("\nTotal Sales for All Weeks: $%.2f\n", getTotalSalesForAllWeeks());
			System.out.printf("Average Weekly Sales: $%.2f\n", getAverageWeeklySales());
			System.out.printf("Week with the Highest Amount in Sales: Week %d\n", getWeekWithHighestSaleAmount());
			System.out.printf("Week with the Lowest Amount in Sales: Week %d\n\n", getWeekWithLowestSaleAmount());
		}
		if (choice > 7) {
			System.out.printf("\nThat is not a valid choice! Try again!\n");
		}
	}
}

// businessmethod
// a. totalsalesforweek --Done
// b. avgsalesforweek --DOne
// c. totalsalesforallweeks --Done
// d. averageweeklysales --Done
// e. weekwithhighestsaleamt
// f. weekwithlowestsaleamt
// analyzeresults //call a through f
// print()
