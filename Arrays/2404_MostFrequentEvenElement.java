class Solution {
    public int mostFrequentEven(int[] nums) {
        int count =0;
        int maxcount=0;
        int large = 0;
        Arrays.sort(nums);
        int num = nums[0];
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                if(nums[i]==num){
                    count++;
                }else{
                    num = nums[i];
                    count=1;
                }

                if(maxcount<count){
                    maxcount=count;
                    large = nums[i];
                }
            }
        }
     if(maxcount==0){
        return -1;
     }else{
        return large;
     }

    }
}
