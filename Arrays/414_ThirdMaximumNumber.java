class Solution {
    public int thirdMax(int[] nums) {
        int max=nums[0];
        int secondmax=Integer.MIN_VALUE ;
        int thirdmax=Integer.MIN_VALUE;

        if(nums.length<=2){
            if(nums.length==1){
                return nums[0];
            }else{
                return Math.max(nums[0],nums[1]);
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]==max || nums[i]==secondmax || nums[i]==thirdmax){
                continue;
            }
            else if(nums[i]>max){
                thirdmax=secondmax;
                secondmax=max;
                max=nums[i];
            }else if(nums[i]>secondmax){
                thirdmax=secondmax;
                secondmax=nums[i];
            }else if(nums[i]>thirdmax){
                thirdmax=nums[i];
            }
        }
        
        boolean check =(Arrays.stream(nums).anyMatch(x -> x ==  -2147483648));
        if(!check && thirdmax == -2147483648 && secondmax!=max){
            return max;
        }else if(check && thirdmax==-2147483648 && secondmax==-2147483648){
            return max;
        }else{
            return thirdmax;
        }
       
    
    }
}
