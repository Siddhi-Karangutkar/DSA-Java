class Solution {
    public List<String> removeAnagrams(String[] words) {
        int n = words.length;
        String[] arr =  Arrays.copyOf(words, n);
        List<String> list = new ArrayList<>();


        for(int i = 0;i<n;i++){
            char[] ch = arr[i].toCharArray();
            Arrays.sort(ch);
            arr[i] = new String(ch);

        }

        // System.out.println(Arrays.toString(arr));

        list.add(words[0]);
        for(int i = 0;i<n-1;i++){
            if(!arr[i].equals(arr[i+1])){
                list.add(words[i+1]);
            }
            
        }

        return list;


    }
}
