class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];
        int mul = 1;
        
        //left
        arr[0] = 1; 
        for(int i = 1;i<n;i++){
            mul = mul*nums[i-1];
           arr[i] =  mul;
        }

        //right
        mul = 1;
        for(int i = n-2;i>=0;i--){
            mul = mul*nums[i+1];
            arr[i] = mul*arr[i];
        }

        return arr;
    }
}
