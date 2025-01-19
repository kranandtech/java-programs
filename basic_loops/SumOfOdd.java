// Write a Java program that displays the sum of n odd natural numbers.

package basic_loops;
import java.util.Scanner;
public class SumOfOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Input number of terms is: ");
		int n = input.nextInt();
		int sum = 0;
		System.out.println("The odd numbers are : ");
		for(int i=0;i<=n;i++) {
			if(i % 2 != 0) {
				System.out.println(i);
				sum = sum += i;
			}
		}
		System.out.println("The Sum of odd Natural Number upto "+n+" terms is: "+sum);

	}

}
