class Solution {
    static String keypad[] = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public List<String> letterCombinations(String digits) {
        List<String> al = new ArrayList<>();
        if(digits.length()==0) return al;
        String ans="";
        possibleWords(digits,ans,al);
        return al;
    }
    static void possibleWords(String s, String ans, List<String> al){
        if(s.length()==0){
            al.add(ans);
            return;
        } 
        String key = keypad[s.charAt(0) - 48];
        if(key.length()==0){
            possibleWords(s,ans,al);
        }else{
        for(int i = 0; i < key.length(); i++)
            //al.add(key[i]);
            possibleWords(s.substring(1),ans+key.charAt(i),al);
        }
    }
}