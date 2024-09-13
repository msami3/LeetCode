class Solution {
    public char findTheDifference(String s, String t) {
        if(s.isEmpty()){
            return t.charAt(0);
        }

        for(int i = 0; i<s.length(); i++){
           t = t.replaceFirst(Character.toString(s.charAt(i)), "");
        }
        
        return t.charAt(0);
        
    }
}