class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

    HashMap<String,List<String>> map  = new HashMap<>();
    String[] arr =  Arrays.copyOf(strs, strs.length);

    int n = strs.length;

    for(int i = 0;i<n;i++){
        char[] ch = arr[i].toCharArray();
        Arrays.sort(ch);
        arr[i] = new String(ch);
    }

    for(int i = 0;i<n;i++){
        if(map.get(arr[i])==null){
            map.put(arr[i],new ArrayList<>());
        }
            map.get(arr[i]).add(strs[i]);
        
    }

    List<List<String>> group = new ArrayList<>(map.values());

    return group;
    }

}
