// Write a Java program to convert minutes into years and days.

package data_types;
import java.util.Scanner;
public class MinutesToYearsAndDays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		long minInYear = 60 * 24 * 365;
		System.out.println("Enter minutes");
		long minutes = input.nextLong();
		long years = (long) (minutes / minInYear);
		int days = (int) (minutes / 60 / 24) % 365;
		System.out.println(years + " years and "+days + " days");
	}

}
