package conditional;
import java.util.Scanner;
public class VowelOrConsonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a character");
		String inputch = input.next();
		if(inputch.length()>1) {
			System.out.println("Please enter a single character");
			return;
		}
		boolean uppercase = inputch.charAt(0) >= 65 && inputch.charAt(0) <= 90;
        boolean lowercase = inputch.charAt(0) >= 97 && inputch.charAt(0) <= 122;
		char ch = inputch.charAt(0);
		switch(ch) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U': System.out.println("Vowel");break;
			default:
				if(!(lowercase || uppercase)) {
					System.out.println("Not a letter");
				}
				else {
					System.out.println("Consonant");
				}
				
			
		}

	}

}
