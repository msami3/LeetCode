class Solution {
    public int romanToInt(String s) {
        int result = 0, currNum = 0, prev = 0;
        
        for(int i = s.length()-1; i>=0; i--){
            char sub = s.charAt(i);
            switch(sub){
                case 'M':
                    currNum = 1000;
                    break;
                case 'D':
                    currNum = 500;
                    break;
                case 'C':
                    currNum = 100;
                    break;
                case 'L':
                    currNum = 50;
                    break;
                case 'X':
                    currNum = 10;
                    break;
                case 'V':
                    currNum = 5;
                    break;
                case 'I':
                    currNum = 1;
                    break;
            }
            
            if(currNum < prev){
                result -= currNum;
            }
            else{
                result+= currNum;
            }
            prev = currNum;
        }
        return result;
    }
}