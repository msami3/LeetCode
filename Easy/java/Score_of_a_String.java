class Solution {
    public int scoreOfString(String s) {

        int result = 0;

        for(int i=0; i<s.length()-1; i++){
            char firstVal = s.charAt(i);
            char secondVal = s.charAt(i+1);

            int rawResult = (int) firstVal - (int) secondVal;

            if(rawResult>=0){
                 result+=rawResult;
            }
            else{
                result+=rawResult*(-1);
            }
        }

        return result;
    }
}