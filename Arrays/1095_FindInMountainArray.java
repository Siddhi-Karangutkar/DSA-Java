/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
     int n =  mountainArr.length();
     int left = 0;
     int right = n-1;
     int peak = 0;

    while(left<=right){
        int mid = (left+right)/2;
        int midele = mountainArr.get(mid);

        if( mid!=0 && mid!= n-1 && (midele>mountainArr.get(mid-1) && midele>mountainArr.get(mid+1))){
            peak = mid;
            break;
        }else if( (mid!=0 && mountainArr.get(mid-1)>midele) ||  (mid!=n-1 && mountainArr.get(mid+1)<midele) ){
            right = mid-1;
        }else if(mid!=0 && mountainArr.get(mid-1)<midele  ||  (mid!=n-1 && mountainArr.get(mid+1)>midele)){
            left = mid+1;
        }
    }

    left = 0;
    right = peak;

    while(left<=right){
        int mid = (left+right)/2;
        int midele = mountainArr.get(mid);;
        if(target == midele){
            return mid;
        }else if(target<midele){
            right = mid-1;
        }else{
            left = mid+1;
        }

    }

    left = peak;
    right = n-1;

    while(left<=right){
        int mid = (left+right)/2;
        int midele = mountainArr.get(mid);;

        if(target == midele){
            return mid;
        }else if(target>midele){
            right = mid-1;
        }else{
            left = mid+1;
        }

    }

    return -1;
    }

}
