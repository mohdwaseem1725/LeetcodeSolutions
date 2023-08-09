class Solution {
    public int secondHighest(String s) {
        Set<Integer> hs = new HashSet<>();
        for(char ch : s.toCharArray()){
            if(Character.isDigit(ch)){
                hs.add(ch-'0');
            }
        }
        List<Integer> ls = new ArrayList<>(hs);
        Collections.sort(ls);
        if(ls.size() <= 1) return -1;
        return ls.get(ls.size() - 2);
        
    }
}