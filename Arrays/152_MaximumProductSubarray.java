class Solution {
    public int maxProduct(int[] nums) {
   
        int max = -10;
        int n = nums.length;

        if(n==1){
            return nums[0];
        }
        for(int i =0;i<n;i++){
            int mul = nums[i];
            int num = nums[i];
            for(int j = i+1;j<n;j++){
                mul = mul*nums[j];
                if(mul>max){
                max = mul;
                }
        }
                if(num>max){
                max = num;
                }
        }

        return max;
    }
}
