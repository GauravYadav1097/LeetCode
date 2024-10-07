package BitMasking;

public class word_search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		
		
		
		
		
		char[][] board = { { 'o', 'a', 'a', 'n' },
		           { 'e', 't', 'a', 'e' }, 
		           { 'i', 'h', 'k', 'r' },
		           { 'i', 'f', 'l', 'v' } };
	}
	
		
	
public static boolean searchword(char[][]board,String word,int cr,int cc,int index) {
		
	
	
		if(index==word.length()) {
			return true;
			
		}
		
		if(cr>=board.length || cc>=board[0].length ||cr<0 || cc<0 ||board[cr][cc]!=word.charAt(index)) {
			
			return false;
		}
		
		
		int[]r= {0,-1,0,1};
		
		int[]c= {1,0,-1,0};
		
		board[cr][cc]='*';
		
		boolean ans=false;
		
		for(int i=0;i<c.length;i++) {
		
			
			ans=searchword(board,word,cr+r[i],cc+c[i],index+1);
			if(ans) {
				return ans;
			}
		}
		
		board[cr][cc]=word.charAt(index);
		return false;
		
		
	}

}
