class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        int left = 0;
        int right = n-1;

        while(left<=right){
            int mid = (left+right)/2;

            if(( mid!=0 && mid%2 == 0 && nums[mid] == nums[mid-1]) || (mid!=n-1 && mid%2!=0 && nums[mid] == nums[mid+1])){
                right = mid-1;
            }else if(( mid!=n-1 && mid%2 == 0 && nums[mid] == nums[mid+1]) || (mid!=0 && mid%2!=0 && nums[mid] == nums[mid-1])){
                left = mid+1;
            }else{
                return nums[mid];
            }
        }
        return 0;

    }
}
