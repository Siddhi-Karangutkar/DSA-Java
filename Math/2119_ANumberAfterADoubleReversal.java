class Solution {
    public boolean isSameAfterReversals(int num) {
        int rev =0 ;
        int num2 = num;
        while(num!=0){
            int d = num%10;
            num = num/10;
            rev = rev*10 + d;
        }
        int num1 =0;
        while(rev!=0){
            int d = rev%10;
            rev = rev/10;
            num1 = num1*10 + d;
        }

        if(num1 == num2){
            return true;
        }else{
            return false;
        }

    }
}
