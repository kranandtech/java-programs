//Write a program in Java to input 5 numbers from the keyboard and find their sum and average.

package basic_loops;
import java.util.Scanner;

public class SumAndAverageOfSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 5 numbers");
		int sum = 0;
		double avg = 0;
		for(int i=0;i<=5;i++) {
			sum += i;
			
		}
		avg = (double)sum / 5;
		System.out.println("The sum of 5 no is :"+ sum);
		System.out.println("The Average is :"+avg);
	}

}
