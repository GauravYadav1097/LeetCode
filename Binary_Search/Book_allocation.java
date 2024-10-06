package Binary_Search;
import java.util.*;
public class Book_allocation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int nob=sc.nextInt();
		int nos=sc.nextInt();
		int book[]=new int[nob];
		for(int i=0;i<book.length;i++) {
			book[i]=sc.nextInt();
		}
		System.out.println(minimumpages(book,nos));
		
	}
	
	public static int minimumpages(int[] book,int nos) {
		
		int lo=0;
		int hi=0;
		for(int i=0;i<book.length;i++) {
			hi+=book[i];
		}
		int ans=0;
		while(lo<=hi) {
			int mid=(lo+hi)/2;
			if(isitpossible(book,mid,nos)==true) {
				ans=mid;
				hi=mid-1;
			}else {
				lo=mid+1;
			}
		}
		return ans;
	}

	public static boolean isitpossible(int[] book, int mid, int nos) {
		// TODO Auto-generated method stub
		int st=1;
		 int current=0;
		 int i=0;
		 while(i<book.length) {
			 if(current+book[i]<=mid) {
				 
				 current=current+book[i];
				 i++;
				 
			 }else {
				 
				 st++;
				 current=0;
			 }
			 
			 if(st>nos) {
				 return false;
			 }
			 
		 }
		return true;
	}
	

}
