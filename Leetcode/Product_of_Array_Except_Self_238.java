package Leetcode;
import java.util.*;
public class Product_of_Array_Except_Self_238 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		product(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void product(int[] arr) {
		int[] left=new int[arr.length];
		int[] right=new int[arr.length];
		left[0]=1;
		for(int i=1;i<arr.length;i++) {
			left[i]=arr[i-1]*left[i-1];
		}
		right[arr.length-1]=1;
		for(int i=arr.length-2;i>=0;i--) {
			right[i]=arr[i+1]*right[i+1];
		}
		for(int i=0;i<arr.length;i++) {
			arr[i]=left[i]*right[i];
		}
		
	}

}
