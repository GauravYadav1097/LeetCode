package Practice;
import java.util.*;
public class Next_permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t!=0) {
			int x=sc.nextInt();
			int[] arr=new int[x];
			for(int i=0;i<arr.length;i++) {
				arr[i]=sc.nextInt();
				
			}
			nextpermutation(arr);
			for(int i=0;i<arr.length;i++) {
				System.out.print(arr[i]+" ");
			}
			
			
			
			t--;
		}
		
		

			
	}
	
	
	public static void nextpermutation(int[] arr) {
		
		int p=0;
		for(int i=arr.length-2;i>=0;i--) {
			if(arr[i]<arr[i+1]) {
				p=i;
				break;
			}
		}
		int q=0;
		for(int i=arr.length-1;i>p;i--) {
			if(arr[i]>arr[p]) {
				q=i;
				break;
			}
		}
		if(p==0 && q==0) {
			rangereverse(arr,0,arr.length-1);
			return;
		}
		
		int temp=arr[p];
		arr[p]=arr[q];
		arr[q]=temp;
		
		
		rangereverse(arr,p+1,arr.length-1);
		
	}
	
	public static void rangereverse(int[] arr,int i,int j) {
		
		while(i<j) {
			int temp=arr[j];
			arr[j]=arr[i];
			arr[i]=temp;
			i++;
			j--;
		}
	}

}
