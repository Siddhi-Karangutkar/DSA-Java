class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int n = nums.length;
        int i = 0;
        int j = 1;
        int max = nums[0];
        int sum = nums[i];
        if(n==1){
            return nums[0];
        }


        HashSet<Integer> set = new HashSet<>();
        set.add(nums[0]);
        while(i<n && j<n){
            if(!set.contains(nums[j])){
                set.add(nums[j]);
                sum = sum + nums[j];
                if(sum>max){
                    max = sum;
                }
            }else{
                set.remove(nums[i]);
                sum = sum - nums[i];
                i++;
                while(set.contains(nums[j])){
                    set.remove(nums[i]);
                    sum = sum-nums[i];
                    i++;
                }
                set.add(nums[j]);
                sum = sum + nums[j];
            }
            j++;  

        }
        return max;
    }
}
