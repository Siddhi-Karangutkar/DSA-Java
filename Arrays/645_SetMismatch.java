class Solution {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        int duplicate = 0;
        int sum = 0;
        for(int i = 0;i<n;i++){
            if(map.containsKey(nums[i])){
                duplicate = nums[i];
            }else{
                map.put(nums[i],0);
                sum = sum + nums[i];
            }
        }

        int actualsum = n*(n+1)/2;
        return new int[]{duplicate, actualsum-sum};

    } 
}
