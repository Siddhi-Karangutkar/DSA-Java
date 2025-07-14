class Solution {
    public void reverseString(char[] s) {
       char temp;
       int l= s.length;
       int i=0,j=l-1;
       while(i<=(l/2) && j>=(l/2)){
        temp=s[i];
        s[i]=s[j];
        s[j]=temp;
        i++;
        j--;
       }
        
    }
}
