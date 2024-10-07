package Practice;

public class Rotate_array_left {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr= {3,5,6,7,34,56,95};
		int k=3;
		rotatearray(arr,k);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void rotatearray(int[] arr,int k) {
		int n=arr.length;
		k=k%n;
		
		rangereverse(arr,0,k-1);
		
		rangereverse(arr,k,n-1);
		
		rangereverse(arr,0,n-1);
	}
	public static void rangereverse(int[] arr,int i,int j) {
		int n=arr.length;
		while(i<j) {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
		
	}

}
