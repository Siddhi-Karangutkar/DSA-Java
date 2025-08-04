class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int temp = 0;
        int count=n;
        for(int i = 0;i<n;i++){
            for(int j=i+1;j<n;j++){

                if(i!=j){
                    temp = matrix[i][j];
                    matrix[i][j]=matrix[j][i];
                    matrix[j][i]=temp;
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
                
                temp = matrix[i][j];
                matrix[i][j] = matrix[i][count-1];
                matrix[i][count-1] = temp;
                count--;
                
            }
            count=n;
        }

    }
}
