class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int n = nums.length;
        int even = 0;
        int odd = n-1;

        while(even<n && odd>0){
            if(nums[even]%2 != 0 && even%2 == 0){
                if(nums[odd]%2 == 0 && odd%2 != 0){
                    int temp = nums[even];
                    nums[even] = nums[odd];
                    nums[odd] = temp;
                }else{
                    odd = odd-2;
                }
            }else{
                even = even+2;
            }
            
        }
        return nums;
        
    }
}
