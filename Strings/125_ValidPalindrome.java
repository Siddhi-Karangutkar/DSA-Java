class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(s);
        int l =s.length();
        int i = 0 ;
        int j = l-1;

        s = s.toLowerCase();
        while(i<=(l/2) && j>=(l/2)){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
