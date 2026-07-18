class Solution {
    public int maxOperations(int[] nums, int k) {
        int n = nums.length;
        int i = 0;
        int j = n-1;
        int count = 0;
         Arrays.sort(nums);

        while(i<j){
            int find = k - nums[i];
            if(nums[j]>find){
                j--;
            }else{
                if(find == nums[j]){
                    System.out.println(nums[i] + " "+ nums[j]);
                    count++;
                    j--;
                }
                i++;
            }
 
        }
        return count;
    }
}
