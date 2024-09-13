class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> sMap = new HashMap<>(); 
        HashMap<Character, Integer> tMap = new HashMap<>(); 

        for(int i = 0; i < s.length(); i++){
            char currLetter = s.charAt(i);
            sMap.put(currLetter, sMap.getOrDefault(currLetter, 0)+1);
        }
        
        for(int i = 0; i < t.length(); i++){
            char currLetter = t.charAt(i);
            tMap.put(currLetter, tMap.getOrDefault(currLetter, 0)+1);
        }

        if(tMap.equals(sMap)) return true;

        return false;

    }
}