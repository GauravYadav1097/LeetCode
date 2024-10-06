package A2Z;
import java.util.*;
public class twoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2,7,9,15};
		int target = 9;
		int ans[] =Sum(arr,target);
		for(int i =0;i<ans.length;i++) {
			System.out.println(ans[i]);
		}
	}
	
	public static int[] Sum(int arr[],int target) {
		
		int ans[] = new int[2];
		HashMap<Integer,Integer>map = new HashMap<>();
		
		for(int i = 0; i < arr.length; i++) {
			
			int rem = target - arr[i];
			if(map.containsKey(rem)) {
				ans[0] =i;
				ans[1] = map.get(rem);
				return ans;
			}
			map.put(arr[i], i);
		}
		return ans;
	}

}
