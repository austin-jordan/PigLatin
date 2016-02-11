import java.util.Scanner;

public class Translation {
	static String answer = "y";
	
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
		public static String translate (String newLine) {
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
		
		public static void keepTranslating () {
			Scanner response = new Scanner(System.in);
			System.out.println("Would you like to translate another line?");
			answer = response.next();
		}
}
