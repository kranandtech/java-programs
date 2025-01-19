// Write a Java program to display n terms of natural numbers and their sum.

package basic_loops;
import java.util.Scanner;
public class SumOfSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number");
		int n = input.nextInt();
		int sum = 0;
		System.out.println("The first n natural numbers are : ");
		for(int i=1;i<=n;i++) {
			sum += i;
			System.out.println(i);
		}
		System.out.println("The Sum of Natural Number upto " + n+" terms :"+ sum );
	}

}
