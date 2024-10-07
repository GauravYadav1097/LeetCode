package Sorting;
import java.util.*;
public class Partition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {1,16,0,4,2,7,3};
		int ans=sortarray(arr,0,arr.length-1);
		System.out.println(ans);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static int sortarray(int[] arr,int si,int ei) {
		
		int lo=0;
		int hi=arr.length-1;
		int last_element=arr[hi];
		
		for(int i=lo;i<hi;i++) {
			if(arr[i]<=last_element) {
				int x=arr[i];
				arr[i]=arr[lo];
				arr[lo]=x;
				lo++;
			}
		}
		int y=arr[lo];
		arr[lo]=arr[hi];
		arr[hi]=y;
		return lo;
	}
	
	
}
