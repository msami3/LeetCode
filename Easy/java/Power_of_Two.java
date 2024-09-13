import java.lang.Math;
class Solution {
    public boolean isPowerOfTwo(int n) {
        boolean ans = false;
         if(n==1){
            return true;
        }
        
        if(n%2!=0||n==0){
            return false;
        }
        
        
        int tempAns =  (int)(Math.log(n) / Math.log(2));
        
        if(Math.pow(2,tempAns)==n){
		    ans = true;
		}
        
        return ans;
        
    }
}