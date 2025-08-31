class Solution {
    public void sortColors(int[] nums) {
        
        int n = nums.length;
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;

        for(int i =0;i<n;i++){
            if(nums[i] == 0){
                count0++;       
            }else if(nums[i] == 1){
                count1++;       
            }else{
                count2++;       
            }
        }

        for(int i = 0;i<n;i++){
            if(i<count0){
                nums[i] = 0;
            }else if(i<count1+count0){
                nums[i] = 1;
            }else{
                nums[i] = 2;
            }
            
        }
    }
}
