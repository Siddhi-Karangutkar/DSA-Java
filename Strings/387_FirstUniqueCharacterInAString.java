class Solution {
    public int firstUniqChar(String s) {
        LinkedHashMap<Character,Integer> map = new LinkedHashMap<>();
        char[] ch = s.toCharArray();
        int n = ch.length;
        
        for(int i = 0;i<n;i++){
            if(map.get(ch[i])==null){
                map.put(ch[i],1);
            }else{
                map.put(ch[i],map.get(ch[i])+1);
            }
        }

        for(int i=0;i<n;i++){
            if(map.get(ch[i])==1){
                return i;
            }
        }
        return -1;
    }
}
