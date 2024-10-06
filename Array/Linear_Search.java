package Array;
import java.util.*;
public class Linear_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		
		}
		int val=sc.nextInt();
		System.out.println(Findindex(arr,val));
		
	}
	
	
	public static int Findindex(int[] arr,int val) {
		for(int i=0;i<arr.length;i++) {
			if(val==arr[i]){
				return i;
			}
		}
		return -1;
	}
	
}
