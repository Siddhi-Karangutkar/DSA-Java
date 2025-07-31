class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        char last[] = s.toCharArray();
        int l = last.length;
        int count=0;
        for(int i = l-1;i>=0;i--){
            if(last[i]==' '){
                break;
            }else{
                count++;
            }
        }
        return count;
    }
}
