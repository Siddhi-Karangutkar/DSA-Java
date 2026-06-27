class Solution {
    public boolean isMonotonic(int[] nums) {
        int n = nums.length;
        int countinc = 0;
        int countdec = 0;

        for(int i = 0;i<n-1;i++){
            if(nums[i]==nums[i+1]){
                countinc++;
                countdec++;
            }else if(nums[i]<nums[i+1]){
                countinc++;
            }else{
                countdec++;
            }
        }

        if(Math.max(countinc,countdec) == n-1){
            return true;
        }
        return false;
    }
}
