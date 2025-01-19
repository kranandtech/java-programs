// Write a Java program to convert temperature from Fahrenheit to Celsius degrees.

package data_types;
import java.util.Scanner;

public class FahrenheitToCelsius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter temperature in Fahrenheit");
		float fahrenheit = sc.nextFloat();
		float celcius = (fahrenheit - 32) * 5/ 9.0f;
		System.out.println("Temperature in Celcius: "+ celcius);
		

	}

}
