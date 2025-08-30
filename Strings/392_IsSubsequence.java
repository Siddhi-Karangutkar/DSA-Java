class Solution {
    public boolean isSubsequence(String s, String t) {
        char[] chs = s.toCharArray();
        char[] cht = t.toCharArray();

        int slength = s.length();
        int tlength = t.length();

        int sptr = 0;
        int tptr = 0;
        int count = 0;
     
            while(tptr<tlength && sptr<slength){
                if(chs[sptr]==cht[tptr]){
                    sptr++;
                    count++;
                }
                tptr++;
            }  
        
        if(count == slength){
                return true;
            }
            return false;
    }
}
