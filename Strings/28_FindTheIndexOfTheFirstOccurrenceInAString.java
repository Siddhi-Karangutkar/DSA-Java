class Solution {
    public int strStr(String haystack, String needle) {
        
        int h = haystack.length();
        int n = needle.length();
        char haystackarr[] = haystack.toCharArray();
        char needlearr[] = needle.toCharArray();

        int i = 0;
        int j = 0;
        int count = 0;
        while(i<h && j<n){
            if(haystackarr[i]==needlearr[j]){
                
                i++;
                j++;
                count++;
                
            }else{
                
                j=j-count;
                i=i-count;
                count =0 ;
                i++;
            }

        }
        if(count == n){
             return i-count;
        }else
        return -1;
    }
}
