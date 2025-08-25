class Solution {
    public int findTheWinner(int n, int k) {
        List<Integer> list = new ArrayList<>();
        
        for(int i = 1;i<=n;i++){
            list.add(i);
        }

        int i = 0;
        while(list.size()>1){
            int l = list.size();
            int num = list.remove((i+k-1)%l);
            i = (i+k-1)%l;  
        }

        // System.out.println(list);
        return list.get(0);
    }


}
