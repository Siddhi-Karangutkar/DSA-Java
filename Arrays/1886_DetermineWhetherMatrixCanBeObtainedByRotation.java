class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
       int n = mat.length;
        int temp = 0;
        int count=n;
        int countOfrotate = 3;
        int count2=0;
    outerloop1:
        for(int i =0;i<n;i++){
            for(int j=0;j<n;j++){
                 if(target[i][j] == mat[i][j]){
                    count2++;
                    if(count2==n*n){
                    return true;                       
                    }

                }
            }
        }


        while(countOfrotate>0){
        for(int i = 0;i<n;i++){
            for(int j=i+1;j<n;j++){

                if(i!=j){
                    temp = mat[i][j];
                    mat[i][j]=mat[j][i];
                    mat[j][i]=temp;
                }
            }
        }


        int limit = 0;

        if(n%2==0){
            limit = (n/2)-1;
        }else{
            limit = (n/2);
        }

        for(int i = 0;i<n;i++){
            for(int j=0;j<=limit && count>0;j++){
                
                temp = mat[i][j];
                mat[i][j] = mat[i][count-1];
                mat[i][count-1] = temp;
                count--;
                
            }
            count=n;
        }
        // System.out.println(Arrays.deepToString(mat));
        int count1=0;
    outerloop:
        for(int i =0;i<n;i++){
            for(int j=0;j<n;j++){
                if(target[i][j] != mat[i][j] && countOfrotate>=2){
                  break outerloop;  

                }else if(target[i][j] != mat[i][j] && countOfrotate==1){
                    return false;
                }else if(target[i][j] == mat[i][j]){
                    count1++;
                    if(count1==n*n){
                    return true;                       
                    }

                }
            }
        }

        countOfrotate--;
        }
        return false;
    }
}
