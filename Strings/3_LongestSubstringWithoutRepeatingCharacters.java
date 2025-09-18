class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int n = s.length();
        char[] arr = s.toCharArray();
        int count = 0;
        int i = 0;
        int j = 1;
        int max = 0;
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        set.add(arr[0]);
        count = 1;
        while(i<n && j<n){
            if(!set.contains(arr[j])){
                set.add(arr[j]);
                count++;
                if(count>max){
                    max = count;
                }
                j++;
            }else{
                set.remove(arr[i]);
                i++;
                count = count -1;
            }
        }

        return max;
    }
}
