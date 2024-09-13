class Solution {
    public boolean isPalindrome(String s) {
        boolean answer = false;
        
        String extract = s.replaceAll("[^a-zA-Z0-9]+", "").toLowerCase();
        
        if(extract.isEmpty()||extract.length()==1){
            return true;
        }
        
        int j = extract.length()-1;
        int k = j;
        
        for(int i = 0; i<(k+1)/2; i++){
            if(extract.charAt(i)!=extract.charAt(j)){
                return false;
            }
            else{
                answer = true;
            }
            j--;
        }
        
        return answer;
    }
}