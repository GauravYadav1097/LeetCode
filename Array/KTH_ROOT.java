package Array;
import java.util.*;
public class KTH_ROOT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=67;
		int k=3;
		int low=1;
		int hi=n;
		int ans=0;
		int prev=0;
		while(low<=hi) {
			int mid=(low+hi)/2;
			ans=(int)(Math.pow(mid, k));
			if(ans<=n) {
				
				ans=Math.max(ans, prev);
				prev=ans;
				
			}else if(ans>n) {
				hi=mid-1;
			}else {
				low=mid+1;
			}
		}
		System.out.println(ans);
	}

}
