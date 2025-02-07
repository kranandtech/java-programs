package array;
import java.util.Scanner;
public class SumOfElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter size of array");
		int n = input.nextInt();
		int[] arr = new int[n];
		int sum = 0;
		for(int i=0;i<n;i++) {
			System.out.println("Enter element: ");
			arr[i] = input.nextInt();
		}
		for(int i=0;i<n;i++) {
			sum += arr[i];
		}
		System.out.println("Sum :"+sum);

	}

}
