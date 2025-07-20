class Solution {
    public int unequalTriplets(int[] nums) {
        int count =0;
        int n = nums.length;
        int fno,sno,tno;

        for(int i = 0;i<n;i++){
            fno = nums[i];
            for(int j =i+1;j<n;j++){
                if(nums[j]!=fno){
                    sno = nums[j];
                    for(int k =j+1;k<n;k++){
                        if(nums[k]!=nums[j] && nums[k]!=nums[i]){
                            tno = nums[k];
                            count++;
                        }
                    }
                }
            }
        }
        return count;
    }
}
