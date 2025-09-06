class Solution {
    public boolean isValid(String word) {
        if(word.length()<3){
            return false;
        }

        word = word.toLowerCase();
        if(word.matches("^[a-zA-Z0-9]*$")){
            boolean vowel = false;
            boolean consonant = false;
            for(char ch: word.toCharArray()){
                if(Character.isLetter(ch)){
                if(ch == 'a' ||ch == 'e' ||ch == 'i' ||ch == 'o' ||ch == 'u'){
                    vowel = true;
                }else{
                    consonant = true;
                }
                if(vowel == true && consonant == true){
                    return true;
                }
                }
            }
        }

        return false;
    }
}
