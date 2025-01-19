// Write a Java program that reads a number in inches and converts it to meters.

package data_types;
import java.util.Scanner;
public class InchesToMeters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter inches");
		double inches = sc.nextDouble();
		double meters = inches * 0.0254;
		System.out.println(meters + " metres");
	}

}
