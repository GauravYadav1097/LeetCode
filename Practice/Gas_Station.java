package Practice;

public class Gas_Station {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] gas= {1,2,3,4,5};
		int[] cost= {3,4,5,1,2};
		System.out.println(index(gas,cost));
	}
	public static int index(int[] gas,int[] cost) {
		
		int tc=0;
		//int n=cost.length;
		for(int i=0;i<cost.length;i++) {
			tc+=gas[i]-cost[i];
		}
		if(tc<0) {
			return -1;
		}
		int current=0;
		int si=0;
		for(int i=0;i<cost.length;i++) {
			current=current+gas[i]-cost[i];
			if(current<0) {
				current=0;
				si++;
			}
		}
		return si;
	}
}
