class Solution {
    public int countQuadruplets(int[] nums) {
        int count =0;
        int n = nums.length;
        int fno,sno,tno,dno;


        for(int i=0;i<n;i++){
            fno = nums[i];
            for(int j =i+1;j<n;j++){
                    sno = nums[j];
                    for(int k = j+1;k<n;k++){
                            tno=nums[k];
                            for(int l = k+1;l<n;l++){
                                if ((fno+sno+tno) == nums[l]){
                                    dno = nums[l];
                                    count++;
                                }
                            }
                        }
                    }
                }
        
        
        return count;
    }
}
