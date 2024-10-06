package Leetcode;
import java.util.*;
public class Search_a_2D_Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		int[][] arr=new int [m][n];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		int target=sc.nextInt();
		System.out.println(search(arr,target));
		/*
			1  2   3    4 
			5  6   7    8
			9  10  11  12
			13 14  15  16
		
			*/
	}
	public static boolean search(int[][] arr,int target) {
		int row=0;
		int col=arr[0].length-1;
		while(row<arr.length && col>=0) {
			if(arr[row][col]==target) {
				return true;
			}
			else if(arr[row][col]> target) {
				col--;
			}
			else {
				row++;
			}
		}
		return false;
	}

}
