package Array;
import java.util.*;
public class reverse {
 //189 rotate array
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {1,2,45,68,3,546};
		reverse(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
		
		
	}
	public static  void reverse(int[] arr) {
		int n=arr.length;
		
		int i=0;
		while(i<n) {
			int temp=arr[i];
			arr[i]=arr[n-1];
			arr[n-1]=temp;
			i++;
			n--;
		}
		
		
	}

}
