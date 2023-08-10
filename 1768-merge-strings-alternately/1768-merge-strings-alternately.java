class Solution {
    public String mergeAlternately(String word1, String word2) {
        String res = "";
        if(word1.length() == 0) return word2;
        if(word2.length() == 0) return word1;
        
        int i = 0;
        int j = 0;
        while(i < word1.length() && j < word2.length()){
            res = res + word1.charAt(i) + word2.charAt(j);
            i++;
            j++;
        }
        while(i < word1.length()){
            res = res + word1.charAt(i);
            i++;
        }
        while(j < word2.length()){
            res = res + word2.charAt(j);
            j++;
        }
        return res;
    }
}