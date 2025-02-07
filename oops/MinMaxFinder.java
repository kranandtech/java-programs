package oops;
import java.util.Scanner;
public class MinMaxFinder {
	public int getMin(int[] arr) {
		int min = arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		return min;
	}
	public int getMax(int[] arr) {
		int max = arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}
		
	
	public static void main(String[] args) {
		MinMaxFinder obj = new MinMaxFinder();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter elements");
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		int min = obj.getMin(arr);
		int max = obj.getMax(arr);
		System.out.println("Max: " + max);
		System.out.println("Min: "+ min);

	}

}
