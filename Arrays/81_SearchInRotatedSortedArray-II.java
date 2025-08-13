class Solution {
    public boolean search(int[] nums, int target) {
        int n = nums.length;
    int left = 0;
    int right = n-1;
     int mid = (left+right)/2;


    while(left<=right){
        if(nums[mid]==nums[left] && mid!=left){
            left++;
        }else if(nums[mid]==nums[right] && mid!=right){
            right--;
        }
        
        else if(nums[left] >= nums[right]){
        mid = (left+right)/2;
        if(target == nums[mid]){
            return true;
        }else if(nums[mid]>=nums[left] && target<nums[mid] && target>=nums[left] && target>=nums[right]){
            right = mid-1;
        }else if(nums[mid]>=nums[left] && target>nums[mid] && target>=nums[left] && target>=nums[right]){
            left = mid+1;
        }else if(nums[mid]>=nums[left] && target<nums[mid] && target<=nums[left] && target<=nums[right]){
            left = mid+1;
        }else if(nums[mid]>=nums[left] && target<nums[mid] && target<=nums[left] && target>=nums[right]){
            left = mid+1;
        }else if(nums[mid]<=nums[left] && target>nums[mid] && target>=nums[left] && target>=nums[right]){
            right = mid-1;
        }else if(nums[mid]<=nums[left] && target>nums[mid] && target<=nums[left] && target<=nums[right]){
            left = left+1;
        }else if(nums[mid]<=nums[left] && target>nums[mid] && target<=nums[left] && target>=nums[right]){
            left = left+1;
        }else if(nums[mid]<=nums[left] && target<nums[mid] && target<=nums[left] && target<=nums[right]){
            right = mid-1;
        }

        }
        else{
        mid = (left+right)/2;
        if(target == nums[mid]){
            return true;
        }else if(target>nums[mid]){
            left = mid+1;
        }else{
            right = mid-1;
        }

        }
        }

    
    return false;
    
}
}
//[1,1,1,1,1,1,1,1,1,1,1,1,1,2,1,1,1,1,1]   2
