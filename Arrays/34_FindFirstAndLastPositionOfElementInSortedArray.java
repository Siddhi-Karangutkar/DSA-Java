class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] arr = new int[2];
        arr[0]=-1;
        arr[1]=-1;
        int n = nums.length;
        int i;

        for(i=0;i<n;i++){
            if(nums[i]==target){
                arr[0]=i;
                break;
            }
        }

        for(int j =n-1;j>0 && i<j ;j--){
            if(nums[j]==target){
                arr[1] = j;
                break;
            }
        }

    if(arr[0]!=-1 && arr[1]==-1){
        arr[1]=arr[0];
        return arr;
    }
    return arr;

    }
}
