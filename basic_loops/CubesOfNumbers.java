// Write a Java program to display the cube of the natural number up to an integer.

package basic_loops;
import java.util.Scanner;
public class CubesOfNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Input number of terms : ");
		int n = input.nextInt();
		for(int i=1;i<=n;i++) {
			System.out.println("Number is : "+i+" and cube of "+i+ " is :"+i*i*i);
		}

	}

}
