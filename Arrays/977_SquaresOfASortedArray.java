class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] newarr = new int[n];
        int i = 0;
        int j = n-1;
        int end = n-1;
        while(i<=j && end>=0){
            if((nums[i]*nums[i])<(nums[j]*nums[j])){
               newarr[end] = nums[j]*nums[j];
               end--;
               j--;
            }else{
                newarr[end] = nums[i]*nums[i];
                end--;
                i++;
            }
        }
        return newarr;
    }
}
