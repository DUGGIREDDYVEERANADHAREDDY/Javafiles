package vera.sub;
import java.util.Scanner;

public class Vowels {
	  public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String input = scanner.nextLine();
	        scanner.close();

	        String result = removeVowels(input);
	        System.out.println("Output after removing vowels: " + result);
	    }

	    public static String removeVowels(String str) {
	        StringBuilder result = new StringBuilder();
	        for (char c : str.toCharArray()) {
	            if (!isVowel(c)) {
	                result.append(c);
	            }
	        }
	        return result.toString();
	    }

	    public static boolean isVowel(char c) {
	        c = Character.toLowerCase(c);
	        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
	    }
	}
