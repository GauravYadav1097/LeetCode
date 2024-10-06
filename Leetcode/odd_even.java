package Leetcode;
import java.util.*;
public class odd_even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[10];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
			}
		int odd=0;
		int even=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				even+=arr[i];
			}
			else {
				odd+=arr[i];
			}
		}
		System.out.println(odd);
		System.out.println(even);
		if(even==odd) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
			
			
	}

}
