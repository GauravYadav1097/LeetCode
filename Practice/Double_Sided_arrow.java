package Practice;
import java.util.*;
public class Double_Sided_arrow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int row=1;
		int space=n-1;
		int star=1;
		int  s2=-1;
		int val=1;
		
		while(row<=n) {
			int i=1;
			while(i<=space) {
				System.out.print(" ");
				i++;
			}
			int j=1;
			int p=val;
			while(j<=star) {
				System.out.print(p);
				p--;
				j++;
				
				
			}
			int k=1;
			while(k<=s2) {
				System.out.print(" ");
				k++;
			}
			 
			
			j=1;
			p++;
			if(row == 1 || row == n) {
				j=2;
			}
			
			while(j<=star) {
				System.out.print(p);
				j++;
				p++;
				
			}
			if(row<(n/2)+1) {
				space-=2;
				star++;
				s2+=2;
				val++;
				
				
			}else {
				star--;
				space+=2;;
				s2-=2;
				val--;
			}
			row++;
			System.out.println();
		
		}
	}

}
