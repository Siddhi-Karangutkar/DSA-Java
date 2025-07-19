class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        int count=0;
        int find,find1;
        for(int i=0;i<nums.length;i++){
            find = nums[i] + diff;
                for(int j=i+1;j<nums.length;j++){
                    if(nums[j]==find){
                        find1 = nums[j] + diff;
                        for(int k= j+1;k<nums.length;k++ ){
                            if(nums[k]==find1){
                                count++;
                            }
                        }
                    }
                }
        }
        return count;
    }
}
