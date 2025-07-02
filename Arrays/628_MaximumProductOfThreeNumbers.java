class Solution {
    public int maximumProduct(int[] nums) {
        int n = nums.length;

        int max = -1000, secondmax = -1000, thirdmax = -1000;
        int secondmin = 1000, thirdmin = 999;
        for(int i=0;i<n;i++){
        if(nums[i]>max){
            thirdmax=secondmax;
            secondmax=max;
            max=nums[i];
        }else if(nums[i]>secondmax){
            thirdmax=secondmax;
            secondmax=nums[i];

        }else if(nums[i]>thirdmax){
            thirdmax=nums[i];
        }

        if(nums[i]<secondmin){
            thirdmin=secondmin;
            secondmin=nums[i];
        }else if(nums[i]<thirdmin){
            thirdmin=nums[i];
        }
        }

        return Math.max(max*secondmax*thirdmax,max*secondmin*thirdmin);
    }


}
