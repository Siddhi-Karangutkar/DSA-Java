class Solution {
    public int maxSum(int[] nums) {
        int n = nums.length;
        int sumpos = 0;
        int maxpos = nums[0];
        int sumneg = 0;
        int maxneg = nums[0];
        HashSet<Integer> set = new HashSet<>();
        //all negative (return max num)
        //mix (sum of +ve num)
        //all positive (sum of +ve num)
      
        for(int i = 0;i<n;i++){
            if(nums[i]>0 && !set.contains(nums[i])){
                set.add(nums[i]);
                sumpos = sumpos + nums[i];
                if(maxpos<sumpos){
                    maxpos = sumpos;
                }
            }else if(nums[i]<=0 && !set.contains(nums[i])){
                set.add(nums[i]);
                if(maxneg<nums[i]){
                    maxneg = nums[i];
                }
            }
        }
        return Math.max(maxpos,maxneg);
    }
}
