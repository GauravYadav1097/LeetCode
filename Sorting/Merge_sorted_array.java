package Sorting;
import java.util.*;
public class Merge_sorted_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr= {1,3,5,7,8,9};
		int[] arr1= {3,4,6,10,12,15};
		
		int[] ans=mergearray(arr,arr1);
		for(int i=0;i<ans.length;i++) {
			System.out.print(ans[i]+" ");
		}
	}

	public static int[] mergearray(int[] arr,int[] arr1) {
		
		int[]ans=new int[arr.length+arr1.length];
		int i=0;
		int j=0;
		int k=0;
		
		while(i<arr.length && j<arr1.length) {
			
			if(arr[i]<=arr1[j]) {
				ans[k]=arr[i];
				i++;
				k++;
			}
			else{
				ans[k]=arr1[j];
				j++;
				k++;
			}
		}
		
		while(i<arr.length) {
			ans[k]=arr[i];
			i++;
			k++;
		}
		
		while(j<arr1.length) {
			ans[k]=arr1[j];
			j++;
			k++;
		}
		
		
		return ans;
	}
}
