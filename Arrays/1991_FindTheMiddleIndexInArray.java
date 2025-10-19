class Solution {
    public int findMiddleIndex(int[] nums) {
        int n = nums.length;
        int sum = 0;
        int left = 0;

        for(int i = 0;i<n;i++){
            sum = sum+nums[i];
        }

        for(int i = 0;i<n;i++){
            if(left == sum-left-nums[i]){
                return i;
            }
            left = left + nums[i];
        }
        return -1;
    }
}
