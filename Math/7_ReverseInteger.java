class Solution {
    public int reverse(int x) {
        int num = 0;

        while(x!=0){
            int d = x%10;
             if(num< Integer.MIN_VALUE/10 || num> Integer.MAX_VALUE/10){
            return 0;
        }
            x= x/10;
            num = num*10 +d;
        }
        
        return num;
    }
}
