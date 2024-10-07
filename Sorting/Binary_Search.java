package Sorting;
import java.util.*;
public class Binary_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {1,2,3,4,5,6,7,8,9};
		int target=5;
		//index(arr,target);
		System.out.println(index(arr,target));
		
 	}
	public static int index(int []arr,int target) {
		int si=0;
		int ei=arr.length-1;
		while(si<ei) {
			int mid=(si+ei)/2;
			if(arr[mid]==target) {
			//	System.out.println(mid);
				return mid;
			}
			if(arr[mid]>target) {
				ei=mid;
			}else {
				si=mid+1;
			}
		}
		return -1;
	}
}
