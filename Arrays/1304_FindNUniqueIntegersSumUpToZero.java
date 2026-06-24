class Solution {
    public int[] sumZero(int n) {
        int[] arr = new int[n];

        for(int i = 0;i<n;i++){
            if(i%2==0){
                arr[i] = i+1;
            }else{
                arr[i] = -arr[i-1];
            }
        }
        if(n%2 !=0){
            arr[n-1] = 0;
        }
        return arr;
    }
}
