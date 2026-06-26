class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {

        int maxdiagonal = 0;
        int maxarea = 0;
        int n = dimensions.length;


        for(int i = 0;i<n;i++){
            int l = dimensions[i][0];
            int b = dimensions[i][1];
            int diagonal = (l*l) + (b*b);
            int area = l*b;

            if(diagonal > maxdiagonal){
                maxdiagonal = diagonal;
                maxarea = area;
            }else if(diagonal == maxdiagonal && area > maxarea){
                maxarea = area;
            }
        }
        return maxarea;
    }
}
