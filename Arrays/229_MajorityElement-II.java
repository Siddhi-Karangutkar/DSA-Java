class Solution {
    public List<Integer> majorityElement(int[] nums) {
        TreeMap<Integer,Integer> count = new TreeMap<>();
        List<Integer> major = new ArrayList<>();
        int n = nums.length;

        for(int i=0;i<n;i++){
            if(count.get(nums[i])!=null){
                count.put(nums[i],count.get(nums[i])+1);
            }else{
                count.put(nums[i],1);
            }
            if(count.get(nums[i])>(n)/3 && !major.contains(nums[i])){
                major.add(nums[i]);
            }
        }

        return major;
    }
}
