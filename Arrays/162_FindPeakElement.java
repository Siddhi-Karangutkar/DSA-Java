int findPeakElement(int* nums, int numsSize) {

    if(numsSize<=1){
        return numsSize-1;
    }

    if(numsSize==2){
        if(nums[0]<nums[1]){
            return 1;
        }else{
            return 0;
        }
    }
    for (int i = 1; i < numsSize - 1; i++) {

        if (nums[i - 1] < nums[i] && nums[i + 1] < nums[i]) {
            return i;
            
        } 
    }
    if(nums[1]<nums[0]){
        return 0;
    }
    if(nums[numsSize-2]<nums[numsSize-1]){
        return numsSize-1;
    }
    return -1;
}
