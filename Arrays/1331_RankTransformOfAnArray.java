class Solution {
    public int[] arrayRankTransform(int[] arr) {
        
        TreeMap<Integer,Integer> ranks = new TreeMap<>();
        int[] arr1 = Arrays.copyOf(arr,arr.length);

        int count =1;
        int n = arr.length;

        Arrays.sort(arr1);

        for(int i=0;i<arr1.length;i++){
            if(ranks.get(arr1[i])==null){
            ranks.put(arr1[i],count);
            count++;
            }else{
                continue;
            }

        }


        // System.out.println(Arrays.toString(arr1));

        for(int i=0;i<arr.length;i++){
            if(ranks.containsKey(arr[i])){
                arr1[i]= ranks.get(arr[i]);
            }
        }
    return arr1;
    }

}
