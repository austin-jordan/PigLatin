import java.util.Scanner;

public class UserInput {

	public static String enterLine () {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a line to be translated: ");
//		String regex = "^[a-zA-Z]+$";
		String regex = "[\\d+/]";
		String line = input.nextLine();
		if(line.matches(regex)) {
			System.out.println("You can't translate numbers into Pig Latin");
			System.out.println(line);
			System.out.println("Would you like to enter a sentence to translate?");
			line = input.nextLine();
		}
		return line;
	}
}
