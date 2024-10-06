package Array;
import java.util.*;
public class Range_reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		//int n=sc.nextInt();
		int arr[]= {1,2,3,4,5,6,7,8,9,10};
		int start=sc.nextInt();
		int end=sc.nextInt();
		rangereverse(arr,start,end);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
			
		}
		
		
	}
	public static void rangereverse(int[] arr,int i, int j) {
		//int n=arr.length;
		while(i<j) {
			int temp=arr[i];
			 arr[i]=arr[j];
			 arr[j]=temp;
			i++;
			j--;
			
		}
	}

}
