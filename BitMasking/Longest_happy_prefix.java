package BitMasking;
import java.util.*;


public class Longest_happy_prefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "acccbaaacccbaac";
		
		System.out.println(Happy_Prefix(s));
	}

	private static int Happy_Prefix(String s) {
		// TODO Auto-generated method stub
		int[] dp = new int[s.length()];
		int len = 0;
		for(int i = 0; i < dp.length;) {
			if(s.charAt(i) == s.charAt(len)) {
				len++;
				dp[i] = len;
				i++;
			}
		else {
			if(len > 0) {
				len = dp[len - 1];
			}
			else {
				i++;
			}
		}
		}
		return  dp[s.length() - 1];
	}
}