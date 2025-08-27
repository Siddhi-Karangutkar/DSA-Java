class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] arr = new int[k];

        for(int i =0;i<n;i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
       
        int max = 0;
        int maxNum = 0;
        int i = 0;

        while(k>0){
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) { 
              //entry.getKey()  entry.getValue()
              if(entry.getValue()>max){
                max = entry.getValue();
                maxNum = entry.getKey();
              }
         }
         max = 0;
         map.remove(maxNum);
         arr[i] = maxNum;
         i++;
         k--;
        }


        // System.out.println(set);
        return arr;
    }
}
