class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
     int n = nums1.length;
     int m = nums2.length;
     int[] newarr = new int[n+m];
 
     
     for(int i = 0;i<n;i++){
        newarr[i] = nums1[i];
     }


     for(int i = 0;i<m;i++){
        newarr[n] = nums2[i];
        n++;
     }


    Arrays.sort(newarr);

    int mid = newarr.length/2;
    
    if(newarr.length %2 == 0){
        return ((newarr[mid] + newarr[mid-1])/2.0);
    }else{
        return newarr[mid];
    }

   
    }
}
