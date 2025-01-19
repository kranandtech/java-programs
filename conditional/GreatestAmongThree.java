// Write a Java program that takes three numbers from the user and prints the greatest number.


package conditional;
import java.util.Scanner;

public class GreatestAmongThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter 3 numbers");
		int a = input.nextInt();
		int b= input .nextInt();
		int c = input.nextInt();
		if(a > b && a > c) {
			System.out.println(a + " is the greatest");
		}
		else if(b > c) {
			System.out.println(b + " is the greatest");
		}
		else {
			System.out.println(c + " is the greatest");
		}
	}

}
