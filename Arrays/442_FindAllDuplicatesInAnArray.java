class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();
       int n = nums.length;

       for(int i = 0;i<n;i++){
        int j = Math.abs(nums[i])-1;
        if(nums[j]>0){
            nums[j] = -nums[j];
        }else{
            list.add(j+1);
        }
       }
       return list;
    }
}
