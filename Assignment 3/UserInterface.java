import java.util.Scanner;

public class UserInterface {

	public void Menu() {

		FileIO a1 = new FileIO("/Users/abdulwasayrida/eclipse-workspace/Assignment_3/src/Salesdat.txt");
		Franchise franchise = a1.readData();
		Scanner input = new Scanner(System.in);
		int choice;
		System.out.printf("Welcome to the Franchise App!\n");
		System.out.printf("We Have Data for 6 Stores for the Last 5 Weeks!\n");

		do {
			System.out.printf("\n===================================================\n");
			System.out.printf("Select a Store Number You Want To See Analytics For:\n<Enter 0 through 5>\n\n");
			int storeNumber = input.nextInt(); // Get the store number
			System.out.printf("You Selected Store %d!\n", storeNumber);
			System.out.printf("------------------------------------------------");
			System.out.printf("\nEnter 1 for Total Sales For Each Week \n"); // ?
			System.out.printf("Enter 2 for Average Sales For Each Week\n"); // ?
			System.out.printf("Enter 3 for Total Sales For All Weeks\n");
			System.out.printf("Enter 4 for Average Weekly Sales\n");
			System.out.printf("Enter 5 for Week with the Highest Amount in Sales. \n");
			System.out.printf("Enter 6 for Week with the Lowest Amount in Sales.\n");
			System.out.printf("Enter 7 for All Analytical Data.\n");
			System.out.printf("---Enter 0 to Quit---\n\n");

			System.out.printf("Enter choice:");
			choice = input.nextInt();

			if (choice != 0) {
				Store store = franchise.getStores(storeNumber);
				store.print(choice);
			
			}

		} while (choice != 0); // Continue to do so while 0 is not pressed (other way to leave the menu)

		if (choice == 0) {
			System.out.printf("You Have Successfully Exited!");
		}

	}
}
