package BitMasking;
import java.util.*;
public class Maximum_XOR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		class Solution {
		  
		    class TrieNode {
		        TrieNode left, right;
		        public TrieNode() {
		            left = null;
		            right = null;
		        }
		    }

		    public void insert(TrieNode root, int num) {
		        TrieNode curr = root;

		        
		        for (int i = 31; i >= 0; i--) {
		            int bit = (num >> i) & 1;
		            if (bit == 0) {
		                if (curr.left == null) {
		                    curr.left = new TrieNode();
		                }
		                curr = curr.left;
		            } else 
		            {
		                if (curr.right == null)   curr.right = new TrieNode();
		                
		                curr = curr.right;
		            }
		        }
		    }

		    
		    public int getMaxXor(TrieNode root, int num) {
		        TrieNode curr = root;
		        int maxXor = 0;

		        // Iterate through the binary representation of num
		        for (int i = 31; i >= 0; i--) {
		            int bit = (num >> i) & 1;
		            if (bit == 0) {
		                if (curr.right != null) {
		                    curr = curr.right;
		                    maxXor += (1 << i);
		                } else {
		                    curr = curr.left;
		                }
		            } 
		            else 
		            {
		                if (curr.left != null) {
		                    curr = curr.left;
		                    maxXor += (1 << i);
		                } else
		                 {
		                    curr = curr.right;
		                }
		            }
		        }

		        return maxXor;
		    }

		    // Given method to maximize XOR values
		    public int[] maximizeXor(int[] nums, int[][] queries) {
		        TrieNode root = new TrieNode();
		        int[] result = new int[queries.length];
		        int[][] query = new int[queries.length][3];

		        // Copy queries to a new array and sort it by the second element
		        for (int i = 0; i < queries.length; i++) {
		            query[i][0] = queries[i][0];
		            query[i][1] = queries[i][1];
		            query[i][2] = i;
		        }

		        // Sort the input numbers and the queries
		        Arrays.sort(nums);
		        Arrays.sort(query, (a, b) -> (a[1] - b[1]));
		        int index = 0;

		        // Process queries
		        for (int i = 0; i < query.length; i++) {
		            while (index < nums.length && nums[index] <= query[i][1]) {
		                insert(root, nums[index]);
		                index++;
		            }

		            
		            if (nums[0] > query[i][1]) {
		                result[query[i][2]] = -1;
		            } else {
		                
		                result[query[i][2]] = getMaxXor(root, query[i][0]);
		            }
		        }

		        return result;
		    }
		}
		
	}

}
