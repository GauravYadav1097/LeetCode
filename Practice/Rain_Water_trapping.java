package Practice;
import java.util.*;
public class Rain_Water_trapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int[] arr= {8,3,0,9,2,0,7};
		
		System.out.print(trap(arr));
	}
	public static int trap(int[] arr) {
		int n=arr.length;
		int[] left=new int[n];
		int[] right=new int[n];
		left[0]=arr[0];
		for(int i=1;i<n;i++) {
			left[i]=Math.max(left[i-1], arr[i]);
		}
		right[n-1]=arr[n-1];
		for(int i=n-2;i>=0;i--) {
			right[i]=Math.max(right[i+1], arr[i]);
		}
		int ans=0;
		for(int i=0;i<n;i++) {
			ans=ans+(Math.min(left[i],right[i])-arr[i]);
		}
		return ans;
	}
}
