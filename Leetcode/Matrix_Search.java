package Leetcode;
import java.util.*;
public class Matrix_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int row=sc.nextInt();
		int col=sc.nextInt();
		int item=sc.nextInt();
		int arr[][]=new int[row][col];
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println(index(arr,item));
		
	}
	public static boolean index(int[][] arr,int item) {
		int row=0;
		int col=arr[0].length-1;
		while(row< arr.length && col>=0) {
			if(arr[row][col]==item) {
				return true;
			}
			else if(arr[row][col]>item) {
				
				col--;
			}
			else {
				row++;
			}
		}
		return false;
		
		
	}
	// 5  10  15
	// 14 16  17
	// 18 20  22
}
