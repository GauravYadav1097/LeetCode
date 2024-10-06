package Array;
import java.util.*;
public class Kadanes_algo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,4,-7,4,1};
		kadane(arr);
	}
	public static void kadane(int[] arr) {
		int ans=0;
		int prev=0;
		for(int i=0;i<arr.length;i++) {
			prev+=arr[i];
			ans=Math.max(prev,ans);
			if(prev<0) {
				prev=0;
			}
		}
		System.out.println(ans);
		
	}

}
