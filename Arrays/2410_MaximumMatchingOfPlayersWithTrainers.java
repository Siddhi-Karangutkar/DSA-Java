class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        Arrays.sort(players);
        Arrays.sort(trainers);
        int pn = players.length;
        int tn = trainers.length;
        int count = 0;

        int j = 0;
        int i = 0;
        
            while(i<pn && j<tn){   
                if(players[i]<=trainers[j]){
                    count++;
                    i++;
                }
                j++;
            }
     
        return count;
    }
}
