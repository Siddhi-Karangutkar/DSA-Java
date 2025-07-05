class Solution {
    public void rotate(int[] nums, int k) {
          int n=nums.length;
          k=k%n;
          
          reverse(0,n-k,nums);
          reverse(n-k,n,nums);
          reverse(0,n,nums);
         
          
    }
      void reverse(int start,int end,int nums[]){
        int j=end-1;
        for(int i=start;(i<=((start+end)/2) && j>=((start+end)/2));i++,j--){
            int temp = nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            
        }
}
}
