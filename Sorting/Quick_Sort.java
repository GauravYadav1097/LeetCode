package Sorting;

public class Quick_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,3,5,7,2,8,4};
		Quicksort(arr,0,arr.length-1);
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
}
	
	public static void Quicksort(int[] arr,int lo, int hi) {
		
		if(lo>=hi) {
			return;
		}
		int idx=partition(arr,lo,hi);
		Quicksort(arr,lo,idx-1);
		Quicksort(arr,idx+1,hi);
	}
	
	public static int partition(int[] arr,int si,int ei) {
		
		int lo=si;
		int piviot=arr[ei];
		for(int i=si;i<ei;i++) {
			if(arr[i]<=piviot) {
				int temp=arr[i];
				arr[i]=arr[lo];
				arr[lo]=temp;
				lo++;
			}
		}
		int temp=arr[ei];
		arr[ei]=arr[lo];
		arr[lo]=temp;
		return lo;
		
	}
}
