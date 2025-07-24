class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
        int count=0;
        int ptr;

        for(int i=0;i<n;i++){
            count=0;
            ptr = i;
            for(int j=i+1;j<n;j++){
                if(nums[i]==nums[j]){
                    count++;
                    continue;
                }else{
                    nums[ptr+1] = nums[j];
                    ptr++;
                }
            }
            n=n-count;
        }
        return n;
        
    }
}
