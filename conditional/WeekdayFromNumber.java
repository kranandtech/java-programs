// Write a Java program that takes a number from the user and generates an integer between 1 and 7. It displays the weekday name.

package conditional;
import java.util.Scanner;
public class WeekdayFromNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter weekday number");
		int weekday = input.nextInt();
		switch(weekday) {
			case 1: System.out.println("Monday");break;
			case 2: System.out.println("Tuesday");break;
			case 3: System.out.println("Wednesday");break;
			case 4: System.out.println("Thursday");break;
			case 5: System.out.println("Friday");break;
			case 6: System.out.println("Saturday");break;
			case 7: System.out.println("Sunday");break;
			default: System.out.println("Invalid");
		}
	}

}
