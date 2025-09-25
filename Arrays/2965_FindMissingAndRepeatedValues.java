class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int[] arr = new int[2];
        int n = grid.length;
        int sum = 0;
        int actualsum = ((n*n)*((n*n)+1))/2;
        List<Integer> list = new ArrayList<>();

        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                if(!list.contains(grid[i][j])){
                    list.add(grid[i][j]);
                    sum = sum + grid[i][j];
                }else{
                    arr[0] = grid[i][j];
                }
            }
        }
    arr[1] = actualsum - sum;
  
        return arr;
    }
}
