package Leetcode;
import java.util.*;
public class Rotate_Image_48 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int arr[][]=new int[n][n];
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j]=sc.nextInt();
			}
			
		}
		rotate(arr);
	}
	//1	2 3     7 4 1 
	//4 5 6     8 5 2 
	//7	8 9		9 6 3
	public static void rotate(int[][] arr) {
		for(int col=0;col<arr[0].length;col++) {
			System.out.print("");
			for(int row=arr.length-1;row>=0;row--) {
				System.out.print(+arr[row][col]+",");
			}
			
		}
	}

}
