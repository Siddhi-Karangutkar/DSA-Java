class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count0=0,count1=0,maxcount0=0,maxcount1=0;
        if(nums.length==1 && nums[0]==1){
            return 1;
        }else if(nums.length==1 && nums[0]==0){
            return 0;
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i] ==0){
                count0++;
                if(count0>maxcount0){
                    maxcount0=count0;
                }
                count1=0;
            }else{
                count1++;
                if(count1>maxcount1){
                    maxcount1=count1;              
              }
            
            count0=0;
            }
        }
        return maxcount1;
        }
        }
    
