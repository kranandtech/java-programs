// Write a Java program that reads an integer between 0 and 1000 and adds all the digits in the integer.

package data_types;
import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer between 0 and 1000");
		int num = input.nextInt();
		int firstDigit = num % 10;
		int remNum = num /10;
		int secondDigit = remNum % 10;
		remNum = remNum / 10;
		int thirdDigit = remNum % 10;
		remNum = remNum / 10;
		int fourthDigit = remNum % 10;
		int sum = firstDigit + secondDigit + thirdDigit + fourthDigit;
		System.out.println("Sum is "+sum);
	}
	
}