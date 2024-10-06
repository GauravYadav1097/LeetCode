package Array;
import java.util.*;
public class rotate_array_189 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int k=sc.nextInt();
		int n=sc.nextInt();
		
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int x=1;
		while(x<=k) {
			int j;
		for(j=0;j<n;j++) {
			int temp=arr[n-1];
			arr[j+1]=arr[j];
			arr[n-1]=arr[0];
			arr[0]=temp;
			}
		k++;
		}
	}

}
