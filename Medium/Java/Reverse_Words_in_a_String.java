class Solution {
    public String reverseWords(String s) {
        s = s.replaceAll("\\s+", " ");
        String arr[] = s.split(" ");
        String temp = "";
        for(int i = arr.length-1; i>=0; i--){
            temp += arr[i]+" ";
        }
        
        return temp.trim();
    }
}