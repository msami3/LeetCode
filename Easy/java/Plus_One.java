import java.math.BigInteger;
class Solution {
    public int[] plusOne(int[] digits) {
        String str = "";
        for(int i = 0; i<digits.length; i++){
            str = str.concat(String.valueOf(digits[i]));
        }
        
        BigInteger temp = new BigInteger(str);
        BigInteger one = new BigInteger("1");
        temp = temp.add(one);
        str = temp.toString();
        
        int ans[] = new int[str.length()];
            for(int i = 0; i<str.length(); i++){
                ans[i] = Character.getNumericValue(str.charAt(i));
            }
        return ans;
    }
}