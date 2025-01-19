// Write a Java program to get a number from the user and print whether it is positive or negative.

package conditional;
import java.util.Scanner;
public class PositiveOrNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input =  new Scanner(System.in);
		System.out.println("Enter a number");
		int num = input.nextInt();
		if(num > 0) {
			System.out.println("Number is positive");
		}
		else if(num < 0) {
			System.out.println("Number is Negative");
		}
		else {
			System.out.println("Number is zero");
		}

	}

}
