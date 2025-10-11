class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int[] sumLeft = new int[n];
        int[] sumRight = new int[n];
        sumLeft[0] = nums[0];
        sumRight[n-1] = nums[n-1];

        int i = 1;
        int j = n-2;

        while(i<n && j>=0){
            sumLeft[i] = sumLeft[i-1]+nums[i];
            sumRight[j] = sumRight[j+1]+nums[j];
            i++;
            j--;
        }
        // System.out.println(Arrays.toString(sumLeft));
        // System.out.println(Arrays.toString(sumRight));

        for(int k = 0;k<n;k++){
            if(sumLeft[k]==sumRight[k]){
                return k;
            }
        }
        return -1;
    }
}
