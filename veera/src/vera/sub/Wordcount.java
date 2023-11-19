package vera.sub;
import java.util.Scanner;

public class Wordcount {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a sentence: ");
	        String sentence = scanner.nextLine();
	        scanner.close();

	        int digitCount = 0;
	        int uppercaseCount = 0;
	        int lowercaseCount = 0;
	        int alphabetCount = 0;
	        int specialCharCount = 0;
	        int vowelCount = 0;
	        String[] words = sentence.split("");
	        int wordCount = words.length;

	        for (char c : sentence.toCharArray()) {
	            if (Character.isDigit(c)) {
	                digitCount++;
	            } else if (Character.isUpperCase(c)) { // convert the upper case 
	                uppercaseCount++;
	                alphabetCount++;
	            } else if (Character.isLowerCase(c)) {  // convert the  lower case 
	                lowercaseCount++;
	                alphabetCount++;
	                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {  // to check the vowels in string 
	                    vowelCount++;
	                }
	            } else if (Character.isWhitespace(c)) {
	            } else {
	                specialCharCount++;
	            }
	        }

	        System.out.println("Total number of digits: " + digitCount);
	        System.out.println("Total number of uppercase letters: " + uppercaseCount);
	        System.out.println("Total number of lowercase letters: " + lowercaseCount);
	        System.out.println("Total number of alphabets: " + alphabetCount);
	        System.out.println("Total number of special characters: " + specialCharCount);
	        System.out.println("Total number of vowels: " + vowelCount);
	        System.out.println("Total number of words: " + wordCount);
	    }


}
