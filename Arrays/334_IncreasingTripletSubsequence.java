class Solution {
    public boolean increasingTriplet(int[] nums) {
        int n = nums.length;
        int min = Integer.MAX_VALUE;
        int secondmin = Integer.MAX_VALUE;

        if(nums.length<3){
            return false;
        }

        for(int i = 0;i<n;i++){
            if(nums[i]<=min){
                System.out.println("in");
                min = nums[i];
            }else if(nums[i]<=secondmin){
                secondmin = nums[i];
            }else{
                return true;
            }

        }

        return false;
    }
}
