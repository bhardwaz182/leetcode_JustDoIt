class Longest_Substring_Without_Repeating Char {
    public int lengthOfLongestSubstring(String s) {
        int st = 0,length = 0;
        Map<Character,Integer> m = new HashMap<Character,Integer>();
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(m.containsKey(c)){
                 if (m.get(c) >= st) 
                     st = m.get(c) + 1;
            } 
            length = Math.max(length, i - st + 1);
            m.put(c,i);
        }
        return length;
    }
}