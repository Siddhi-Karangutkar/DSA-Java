class Solution {
    public int secondHighest(String s) {
        char ch[] = s.toCharArray();
        int n = ch.length;
        int max=-1;
        int secondmax=-1;
        boolean flag = false;
        for(int i=0;i<n;i++){
            if(Character.isDigit(ch[i])){
                if(flag==false){
                    max = Integer.parseInt(""+ch[i]);
                    flag=true;
                }else{
                    if(Integer.parseInt(""+ch[i])>max){
                        secondmax=max;
                        max=Integer.parseInt(""+ch[i]);
                    }else if(Integer.parseInt(""+ch[i])>secondmax && Integer.parseInt(""+ch[i])<max){
                        secondmax=Integer.parseInt(""+ch[i]);
                    }
                }
            }
        }
        
        
        
        if(secondmax==-1){
            return -1;
        }else{
        return secondmax;

        }

    }
}
