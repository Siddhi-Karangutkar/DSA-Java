class Solution {
    public int removeElement(int[] nums, int val) {
        int n =nums.length;
        int count=0;
        int j=n-1;
        int notequal=0;
        int i=0;
        if(n==1){
            if(nums[0]==val){
                return 0;
            }else{
                return n;
            }
        }
        if(n==0){
            return 0;
        }
       
       for(int k=0;k<n;k++){
        if(nums[k]==val){
            count++;
        }
       }

        while(i<n && j>=0){
           if(nums[i]!=val){
            notequal++;
            i++;
           }else{

            if(nums[j]!=val){
                // count++;
             nums[i]=nums[j];
             j--;
           }else{
            j--;
           }

           }
        }
        if(count ==0 && notequal == 0){
            return 0;
        }else
        return nums.length - count;
    }
}
