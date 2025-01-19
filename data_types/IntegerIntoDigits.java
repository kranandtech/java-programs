// Write a Java program to break an integer into a sequence of digits.

package data_types;
import java.util.Scanner;
public class IntegerIntoDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter five digit positive integer");
		int num = input.nextInt();
		int n1 = num / 10000 % 10;
		int n2 = num / 1000 % 10;
		int n3 = num / 100 % 10;
		int n4 = num / 10 % 10;
		int n5 = num % 10;
	    System.out.println(n1 + " " + n2 + " " + n3 + " " + n4 + " " + n5);

		

	}

}
