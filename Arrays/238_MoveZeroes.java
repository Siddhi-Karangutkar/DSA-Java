class Solution {
    public void moveZeroes(int[] nums) {
        int zeroptr=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0 && zeroptr==-1){
                zeroptr=i;
            }else if(nums[i]!=0 && zeroptr!=-1){
                nums[zeroptr]=nums[i];
                nums[i]=0;
                zeroptr++;
            }
        }
    }
}
