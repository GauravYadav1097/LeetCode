
class Avengers_End_Game{
    public static void main(String[] args) {
        int[] prime = {2,3,5};
        int n =1000;


    }
    public static int count(int[] prime, int n){
        int len = prime.length;
        int ans= 0;
        for(int i =0;i<(1<<len);i++){
            if((FastCount(i)&1)!=0){

            }
            else{
                ans = InterSection(prime)
            }
        }
    }
    public static int FastCount(int n){
        int count = 0;
        while(n>0){
            n = (n&(n-1));
            count++;
        }
        return count;
    }
}