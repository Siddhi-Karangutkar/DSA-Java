class Solution {
    public int majorityElement(int[] nums) {

        int count=0;
        Arrays.sort(nums);
        int num = nums[0];
        for(int i = 0;i<=nums.length-1;i++){
            if(nums[i]==num){
                count++;
                if(count>(nums.length)/2){
                    return nums[i];
                }
            }else{
                num = nums[i];
                count=1;
            }
        }

    return -1;
    }
}
