package BitMasking;
import java.util.*;

public class Longest_Sub_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "banana";
		Longest(s);
	}
	public static String Longest(String s) {
		int lo =1;
		int hi = s.length();
		String ans ="";
		while(lo <= hi) {
			int mid  = (lo + hi) / 2;
			String str = result(s, mid);w
			if(str.length()>0) {
				ans = str;
				lo = mid + 1;
			}
			else {
				hi = mid - 1;
			}
		}
		return null;
	}
	private static String result(String s, int mid) {
		// TODO Auto-generated method stub
		long hv = 0;
		long mod = 1000_000_009;
		long pr = 31;
		long pow = 1;
		for(int i = mid -  1; i >= 0; i--) { // unicode pichhe se nikalenge
			hv = hv +  (((s.charAt(i) - 'a' + 1) * pow) % mod) % mod;
			if(i > 0) {
				pow = (pow * pr) % mod;
			}
		}
		HashMap<Long, ArrayList<Integer>> map = new HashMap<>();
		map.put(hv,  new ArrayList<>()); // empty list ADD KARNA 
		map.get(hv).add(0); // zero index
		for(int ei = mid, si = 0; ei < s.length(); si++, ei++) {
			hv = hv - (((s.charAt(si) - 'a' + 1) * pow) % mod + mod)%mod;
			hv = (hv * pr) % mod;
			hv = (hv + s.charAt(ei)) % mod;
		}
		return null;
	}
}