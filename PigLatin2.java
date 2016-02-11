import java.util.Arrays;
import java.util.Scanner;

//This program takes user input and translates it into Pig Latin
public class PigLatin2 {
	static String newLine = "";
	static String translation;
	static String[] words;
	static String answer = "y";
//This method asks the user to enter a line.
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
	
	//This method takes an individual word and translates it into PigLatin
	public static String pigLatinize(String newLine) {
		String translation = "";
		String vowels = "aeiou";
		//This for loop, loops through the individual word.
		overloop: for (int k = 0; k < newLine.length(); k++) {
		//This for loop, loops through the vowels.
			for (int j = 0; j < 5; j++) {
				while (newLine.charAt(k) == vowels.charAt(j)) {
					if (newLine.charAt(0) == vowels.charAt(j)) {
						translation = newLine + "way";
						break overloop;
					}
						String prefix = newLine.substring(0, k);
						String suffix = newLine.substring(k);
						translation = suffix + prefix + "ay";
						break overloop;
					}
			}
		}
		return translation;
	}
	//This method takes the String separates it into words and puts it into an array
	public String translate (String newLine) {
		String pigString = "";
		if (newLine.contains(" ")) {
			String[] words = newLine.split("[\\W+/]");
			String[] pigWords;
			pigWords = new String[words.length];
			overloop:
			for (int i = 0; i < words.length; i++) {
				//Here each word is being translated individually into Pig Latin
				pigWords[i] = pigLatinize(words[i]);
				StringBuilder builder = new StringBuilder();
				//This loop then builds a String out of the translated words.
				for (String pigSentence : pigWords) {
					if (builder.length() > 0) {
						builder.append(" ");
					}
					builder.append(pigSentence);
				}
				String pigSentence = builder.toString();
				pigString = pigSentence;
			} 
		}
		else {
			pigString = pigLatinize(newLine);
		}
		return pigString;
	}
	public void keepTranslating () {
		Scanner response = new Scanner(System.in);
		System.out.println("Would you like to translate another line?");
		answer = response.next();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to the Pig Latin Translator!");
		PigLatin2 user = new PigLatin2();
		while (answer.equalsIgnoreCase("y")) {
			String newLine = user.enterLine();
			String pigLatin = user.translate(newLine);
			System.out.println(pigLatin);
			user.keepTranslating();
		}
		System.out.println("Goodbye, nice knowing ya!");
		
	}
}


