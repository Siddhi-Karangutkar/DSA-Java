class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;    
        int j = 0;
        int i = 0;

        double sum = 0;
        while(j<k){
             sum = nums[j] + sum;
             j++;
        }
        double max = sum/k;
        while(i<n-k && j<n){
           sum = sum - nums[i]+ nums[j];
           double avg = sum/k;
           if(avg>max){
            max = avg;
           }
           i++;
           j++;
        }

        return max;
    }
}
