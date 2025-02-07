package array;

import java.util.Scanner;

public class MatrixSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter size of row");
		int row = input.nextInt();
		System.out.println("Enter size of column");
		int col = input.nextInt();
		int[][] arr = new int[row][col];
		int sum = 0;
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.println("Enter element: ");
				arr[i][j] = input.nextInt();
			}
			
		}
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				sum += arr[i][j];
			}
			
		}
		System.out.println("Sum :"+sum);

	}

}
