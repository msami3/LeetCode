class Solution {
    public int strStr(String haystack, String needle) {
        int result = -1;
        int needleSize = needle.length();
        int haystackSize = haystack.length();
        
        if(needleSize==0||needle.equals(haystack)){
            result = 0;
        }
            
        else if(!haystack.contains(needle)){
            result = -1;
        }
        
        else{
            for(int i = 0; i<=haystackSize-needleSize; i++){
                if((haystack.substring(i,i+needleSize)).equals(needle)){
                    return i;
                }
            }
        }
        
    
        return result;
    }
}