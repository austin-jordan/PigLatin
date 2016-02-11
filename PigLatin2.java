import java.util.Arrays;
import java.util.Scanner;

//This program takes user input and translates it into Pig Latin
public class PigLatin2 {
	static String newLine = "";
	static String translation;
	static String[] words;
	static String answer = "y";

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to the Pig Latin Translator!");
		PigLatin2 user = new PigLatin2();
		while (answer.equalsIgnoreCase("y")) {
			String newLine = UserInput.enterLine();
			String pigLatin = Translation.translate(newLine);
			System.out.println(pigLatin);
			Translation.keepTranslating();
		}
		System.out.println("Goodbye, nice knowing ya!");
		
	}
}


