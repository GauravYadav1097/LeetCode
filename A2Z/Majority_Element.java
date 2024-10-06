package A2Z;
import java.util.*;
public class Majority_Element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr [] = {2,2,1,1,1,2,2};
		System.out.println(majorElement(arr));
		
//		int nums [] = {2,2,1,1,1,2,2,5,6,1;
//		HashMap<Integer,Integer> map  = new HashMap<>();
//	    for(int i=0; i<nums.length;i++){
//
//	        if(map.containsKey(nums[i])){
//	            map.put(nums[i],map.get(nums[i])+1);
//	        }else{
//	            map.put(nums[i],1);
//	        }
//	    }
//	    Set<Integer> keys = map.keySet();
//	    for(int key:keys) {
//	    	System.out.println(key+" "+ map.get(key));
//	    }
	    
		
	}
	
	public  static int majorElement(int[] arr){

        int count=0;
        int Mele=0 ;
        for(int i=0;i<arr.length;i++){

           if(count == 0){
            count ++;
            
             Mele = arr[i];
           }
           else if (Mele == arr[i]){
            count++;
           }
           else{
            count--;
           }

        }
        return Mele;
    }

}
