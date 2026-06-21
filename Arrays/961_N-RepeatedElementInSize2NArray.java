class Solution {
    public int repeatedNTimes(int[] nums) {
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i = 0;i<n;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],1);
            }else{
                return nums[i];

            }
        }

        return 0;
    }
}
