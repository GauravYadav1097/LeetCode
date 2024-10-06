package Array;
import java.util.*;
public class Binary_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	//	int n=sc.nextInt();
	//	int[] arr=new int[n];
		int[] arr= {1,2,3,4,5,6,7,8,9,};
		int target=10;
		System.out.println(index(arr,target));
		
	}
	public static int index(int[] arr,int target) {
		int low=0;
		int hi=arr.length-1;
		
		
			while(low<=hi) {
				int mid=(low+hi)/2;
				if(arr[mid]==target) {
					return mid;
				}
				else if(arr[mid]>target) {
					 hi=mid-1;;
					
				}else {
					low=mid+1;
					
				}
		
			}
			return -1;

	}
}
