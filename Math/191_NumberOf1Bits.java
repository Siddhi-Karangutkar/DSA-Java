class Solution {
    public int hammingWeight(int n) {
        
        String binary = Integer.toBinaryString(n);
        // System.out.print(binary);
        int count = 0;

        char ch[] = binary.toCharArray();

        for(int i = 0;i<ch.length;i++){
            if(ch[i] == '1'){
                count++;
            }
        }
        return count;
    }
}
