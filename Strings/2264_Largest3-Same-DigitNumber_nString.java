class Solution {
    public String largestGoodInteger(String num) {
        
        int n = num.length();

        for(int i = 9;i>=0;i--){
            if(num.contains(""+i+i+i)){
                return ""+i+i+i;
            }
        }
        return "";
    }
}
