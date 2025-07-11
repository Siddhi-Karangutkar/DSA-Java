class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int l= flowerbed.length;
        
        int count=0;
       if(l==1 && flowerbed[0]==1){
            if(n==0){
                return true;
            }else{
                return false;
            }
       }else if(l==1 && flowerbed[0]==0){
            return true;
       }else if(l==2 && flowerbed[0]!=flowerbed[1]){
        if(n==0){
            return true;
        }else{
            return false;
        }
       }else if(l==2 && flowerbed[0]==flowerbed[1]){
        if(n==2){
            return false;
        }else{
            return true;
        }
       }else if(l==3 && n==1){
        if((flowerbed[0] ==0 && flowerbed[1]==1 && flowerbed[2]==0 ) || (flowerbed[0] ==1 && flowerbed[1]==0 && flowerbed[2]==1)){
            return false;
        }else{
            return true;
        }
       }else if(l==3 && n==0){
        return true;
       }else if(l==3 && n==2){
        if(flowerbed[0] ==0 && flowerbed[1]==0 && flowerbed[2]==0 ){
            return true;
        }else{
            return false;
        }
       }
       else{

        if(flowerbed[0] ==0 && flowerbed[1]==0 && (flowerbed[2]==0 || flowerbed[2]==1)){
            flowerbed[0]=1;
            count++;
        }
         if(flowerbed[l-1] ==0 && flowerbed[l-2]==0 && (flowerbed[l-3]==0 || flowerbed[l-3]==1)){
            flowerbed[l-1]=1;
            count++;
        }
        for(int i=2;i<l-1;i++){
            if(count>=n){
                return true;
            }
            if(flowerbed[i-1]==0 && flowerbed[i]==0 && flowerbed[i+1]==0){
                flowerbed[i]=1;
                count++;
            }
        }
        return false;
       }
    }
}
