class Solution {
    public void reverseString(char[] s) {
        char[] temp = new char[s.length];
        int index = 0;
        for(int i = s.length-1; i>=0; i--){
            temp[index]=s[i];
            index++;
        }
        
        for(int i = 0; i<s.length; i++){
            s[i]=temp[i];
        }
    }
}