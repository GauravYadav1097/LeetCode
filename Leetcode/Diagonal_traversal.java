package Leetcode;
import java.util.*;
public class Diagonal_traversal {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int arr[][]=new int[n][m];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				arr[i][j]=sc.nextInt();
			}
			
		}
		traverse(arr);
		
	}
	
	
	public static void traverse(int[][] arr) {
		
		int n=arr.length;
		int m=arr[0].length;
		
		int[]ans=new int[n*m];
		int index=0;
		
		for(int i=0;i<(n+m-1);i++) {// total digonal 
			int row=0;
			int col=0;
			if(i<m) {
				row=0;
				col=i;
				
			}
			
			else{
				row=i-m+1;
				col=m-1;
				
			}
			ArrayList<Integer>list=new ArrayList<>();
			while(row<arr.length && col>=0) {
				list.add(arr[row][col]);
				row++;
				col--;
				
			}
			if(i%2==0) {
				Collections.reverse(list);
			}
			for(int val:list) {
				ans[index]=val;
				index++;
			}
		}
	
		
		for(int ix=0;ix<ans.length;ix++) {
			System.out.print(ans[ix]+" ");
			
		}
	}
	

}
