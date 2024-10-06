package Leetcode;
import java.util.*;
public class _42_Trapping_Rain_Water {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		trapwater(arr);
	}
	public static void trapwater(int[] arr) {
		int ans=0;
		int n=arr.length;
		int []left=new int[n];
		int []right=new int[n];
		left[0]=arr[0];
		for(int i=1;i<n;i++) {
			left[i]=Math.max(left[i-1], arr[i]);
		}
		right[n-1]=arr[n-1];
		for(int i=n-2;i>=0;i--) {
			right[i]=Math.max(right[i+1], arr[i]);
		}
		for(int i=0;i<arr.length;i++) {
			ans=ans+(Math.min(left[i], right[i])- arr[i]);
		}
		System.out.println(ans);
	}

}
