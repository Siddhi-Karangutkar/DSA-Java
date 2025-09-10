class Solution {
    public int maximumGap(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int max = 0;
        for(int i = 0;i<n-1;i++){
            int gap = nums[i+1]-nums[i];
            if(gap>max){
                max = gap;
            }
        }
        return max;
    }
}
