class Solution {
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int n = arr.length;
        int count =0;
        int fno,sno,tno;
        for(int i =0;i<n;i++){
            fno = arr[i];
            for(int j = i+1;j<n;j++){
                if(Math.abs(fno-arr[j]) <= a){
                    sno =arr[j];
                    for(int k=j+1;k<n;k++){
                        if(Math.abs(sno - arr[k])<=b && Math.abs(fno - arr[k])<=c){
                            tno = arr[k];
                            count++;
                        }
                    }
                }
            }
        }
        return count;
    }
}
