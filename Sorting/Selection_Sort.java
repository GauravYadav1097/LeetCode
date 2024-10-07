package Sorting;
import java.util.*;
public class Selection_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] ={4,2,6,1,8,2,10};
		
		//select and swap with minimum 
		
		for(int i =0;i < arr.length ;i++) {
			
			int min =i;
			for(int j = i;j < arr.length ;j++) {
				
				if(arr[j]<arr[min]) {
					
					int temp =arr[j];
					arr[j] =arr[min];
					arr[min]=temp;
				}
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
