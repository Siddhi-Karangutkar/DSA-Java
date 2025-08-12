class Solution {
    public int findMin(int[] nums) {
        
        int n = nums.length;
        int left = 0;
        int right = n-1;
        int min = 5000;

        if(nums[left]<=nums[right]){
            return nums[left];
        }



        while(left<=right){
            int mid = (left+right)/2;

            if(mid>n-1 && nums[mid+1]<nums[mid]){
                return nums[mid+1];
            }else if(mid>0 && nums[mid-1]>nums[mid]){
                return nums[mid];
            }else if(nums[mid]>nums[right]){
                left = mid+1;
            }else if(nums[mid]<nums[right]){
                right = mid-1;
            }
                      
        }
    return -1;
    }
}
