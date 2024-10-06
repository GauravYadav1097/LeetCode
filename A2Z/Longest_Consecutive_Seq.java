package A2Z;
import java.util.*;
public class Longest_Consecutive_Seq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {100,4,200,1,2,3,101,102,103,104,105};
		// 1 1 2 3 4 100 101 102 200
		System.out.println(longestConsecutive(arr));
	}
	
	public static int longestConsecutive(int[] arr) {
		
        int count = 1;
        int max =0;
        Arrays.sort(arr);
        int lastSmaller = Integer.MIN_VALUE;
        
        for(int i = 0; i < arr.length; i++) {
        	
        	if(arr[i]-1 == lastSmaller) {
        		count++;
        		lastSmaller = arr[i];
        	}
        	else if(arr[i]!=lastSmaller) {
        		count =1 ;
        		lastSmaller = arr[i];
        		
        	}
        	
        	max = Math.max(count, max);
        		
        	
        }
        
        return max;
        
    }


}
