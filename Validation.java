import java.util.Scanner;

public class Validation {

	//This method checks that user inputs either yes or no.
		public static String isValidChoice(Scanner input) {
			String inp = input.nextLine();
			while(!inp.matches("^[yY]es|[nN]o|[ynYN]$")) {
				System.out.println("That is not a valid option.");
//				System.out.println("Would you like to continue? (y/n): ");
				inp= input.nextLine();
			}
			return inp; 
		}
}
