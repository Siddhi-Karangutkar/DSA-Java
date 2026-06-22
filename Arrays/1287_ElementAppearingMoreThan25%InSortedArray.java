class Solution {
    public int findSpecialInteger(int[] arr) {
        int n = arr.length;
        int count = 0;
        double checkCount = 0.25*n;
        for(int i = 0;i<n-1;i++){
            if(arr[i]==arr[i+1]){
                count++;
            }else{
                count = 0;
            }

            if(count+1>checkCount){
                System.out.println(count);
                return arr[i];
            }
        }
        return arr[0];
    }
}
