package conditional;
import java.util.Scanner;
public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a year");
		int year = input.nextInt();
		if(year % 4 == 0 && (year%100!=0 ||( year % 100 == 0 && year % 400 == 0))) {
			System.out.println("leap year");
			
		}
		else {
			System.out.println("Not a leap year");
		}
	}

}
