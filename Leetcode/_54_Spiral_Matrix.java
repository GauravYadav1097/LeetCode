package Leetcode;
import java.util.*;
public class _54_Spiral_Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		int[][] arr=new int[m][n];
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		
		int minr=0;
		int minc=0;
		int maxr=arr.length-1;
		int maxc=arr[0].length-1;
		int total=arr.length*arr[0].length;
		int count=0;
		List<Integer>lst=new ArrayList<>();	
		while(count<total) {
		for(int i=minc;i<=maxc &&count<total;i++) {
			System.out.print(arr[minr][i]+" ");
			lst.add(arr[minr][i]);
			count++;
		}
		minr++;
		for(int i=minr;i<=maxr &&count<total;i++) {
			System.out.print(arr[i][maxc]+" ");
			lst.add(arr[i][maxr]);
			count++;

		}
		maxc--;
		
		for(int i=maxc;i>=minc &&count<total;i--) {
			System.out.print(arr[maxr][i]+" ");
			lst.add(arr[maxr][i]);
			count++;

		}
		maxr--;
		
		for(int i=maxr;i>=minr &&count<total ;i--) {
			System.out.print(arr[i][minc]+" ");
			lst.add(arr[i][minc]);
			count++;

		}
		minc++;
		
	}
	}

}
