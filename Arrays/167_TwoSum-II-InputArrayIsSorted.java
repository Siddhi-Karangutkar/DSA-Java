class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;
        int  i = 0;
        int j = n-1;
        while(i<n && j>=i){
            int check = target - numbers[i];
            if(check == numbers[j]){
                return new int[] {i+1,j+1};
            }else if(numbers[j] > check ){
                j--;
            }else{
                i++;
            }
        }
        return new int[] {1,2};
    }
}
