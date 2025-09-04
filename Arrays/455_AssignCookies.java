class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int gn = g.length;
        int sn = s.length;
        int count = 0;

        int j = 0;
        int i = 0;
        
            while(i<gn && j<sn){   
                if(g[i]<=s[j]){
                    count++;
                    i++;
                }
                j++;
            }
     
        return count;
    }
}
