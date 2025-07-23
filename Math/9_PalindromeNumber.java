class Solution {
    public boolean isPalindrome(int x) {
        String num = Integer.toString(x);
        char ch[] = num.toCharArray();
        int n= ch.length;
        int j = n-1;
        char temp;
        for(int i =0;i<= (n/2) && j>=(n/2);i++,j--){
            temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;
        }

        String num1 = new String(ch);

        if(num.equals(num1)){
            return true;
        }else{
            return false;
        }
        
    }
}
