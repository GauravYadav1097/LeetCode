package Practice;
import java.util.*;
public class Pattern_Hour_Glass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int row=1;
		int star=2*n+1;
		int space=0;
		int val=n;
		while(row<=2*n+1) {
			int i=1;
			while(i<=space) {
				System.out.print(" ");
				i++;
			}
			int j=1;
			int x=val;
			while(j<=star) {
				System.out.print(x);
				if(j<=star/2) {
					x--;
				}else {
					x++;
				}
				j++;
				
			}
			if(row<((2*n+1)/2)+1) {
				star-=2;
				space++;
				val--;
			}else {
				star+=2;
				space--;
				val++;
			}
			row++;
			System.out.println();
		}
		
		
	}

}
