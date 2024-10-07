package Sorting;
import java.util.*;
public class Bubble_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		sort(arr);
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+"");
		}
	}
	public static int[] sort(int[] arr) {
		
		
		for(int j=1;j<arr.length;j++) {
			for(int i=0;i<arr.length-j;i++) {
				if(arr[i]>arr[i+1]) {
					int temp=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
				}
			}
	
		}
		return arr;
	
	}

}
