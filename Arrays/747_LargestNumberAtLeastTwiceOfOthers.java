class Solution {
    public int dominantIndex(int[] nums) {
        int n = nums.length;
        int max = 0;
        int maxindex = -1;
        int secondmax = 0;
        for(int i = 0;i<n;i++){
            if(nums[i]>max){
                secondmax = max;
                maxindex = i;
                max = nums[i];
            }else if(nums[i]>secondmax){
                secondmax = nums[i];
            }
        }
        if((2*secondmax) <= max){
            return maxindex;
        }
        return -1;
    
    }
}
