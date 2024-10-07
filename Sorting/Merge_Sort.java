
package Sorting;
import java.util.*;
public class Merge_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,3,5,2,7,4};
		
		int[] ans=sortarray(arr,0,arr.length-1);
		for (int i=0;i<ans.length;i++) {
			System.out.print(ans[i]+" ");
		}
	}
	
	public static int[] sortarray(int[] arr,int si,int ei) {
		
		if(si==ei) {
			int[]ans=new int[1];
			ans[0]=arr[si];
			return ans;
		}
		int mid=(si+ei)/2;
		int[] fa=sortarray(arr,si,mid);
		int[] sa=sortarray(arr,mid+1,ei);
		
		
		return mergearray(fa,sa);
		
		
	}

	public static int[] mergearray(int[]arr,int[] arr1) {
	
		int n=arr.length;
		int m=arr1.length;
		int[] ans=new int[n+m];
		
		int i=0;//array
		int j=0;//arr1
		int k=0;//answer
		
		while(i<arr.length && j<arr1.length) {
			if(arr[i]<=arr1[j]) {
				
				ans[k]=arr[i];
				i++;
				k++;
			}else {
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
