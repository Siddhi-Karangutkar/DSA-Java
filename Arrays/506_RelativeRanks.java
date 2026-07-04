class Solution {
    public String[] findRelativeRanks(int[] score) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = score.length;
        String[] answer = new String[n];

        for(int i = 0;i<n;i++){
            map.put(score[i],i);
        }

        Arrays.sort(score);
        int count = 4;

        for(int i = n-1;i>=0;i--){
            if(i==n-1){
                answer[map.get(score[i])] = "Gold Medal";
            }else if(i == n-2){
                answer[map.get(score[i])] = "Silver Medal";   
            }else if(i == n-3){
                answer[map.get(score[i])] = "Bronze Medal";
            }else{
                answer[map.get(score[i])] = ""+(count);
                count++;
            }
        }
        return answer;
    }
}
