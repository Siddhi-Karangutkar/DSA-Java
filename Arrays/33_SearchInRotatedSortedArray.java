class Solution {
    public int search(int[] nums, int target) {
        
    int n = nums.length;
    int left = 0;
    int right = n-1;
    int left1=0;
    int right1=n-1;

    while(left<=right && nums[left] > nums[right]){
        int mid = (left+right)/2;

        if(target == nums[mid]){
            return mid;
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

        left1= left;
        right1=right;
    }


    while(left1<=right1 && nums[left1]<=nums[right1]){
        int mid = (left1 + right1)/2;
        if(target == nums[mid]){
            return mid;
        }else if(target>nums[mid]){
            left1 = mid+1;
        }else{
            right1 = mid-1;
        }
    }

    return -1;
    }

}
