class Solution {
    public boolean isPalindrome(int x) {
        boolean ans = false;
        if(x < 0){
            ans = false;
        }
        
        else if(x/10==0){
            ans = true;
        }
        
        else{
            long tempDig = x;
            int countDig = (int) (Math.log10(tempDig));
            long revX = 0;

            for(int i = countDig; i>=0; i--){
                revX+=(tempDig%10)*Math.pow(10,i);
                tempDig/=10;
            }
            
            if(revX == x){
                ans = true;
            }
        }
        
        return ans;
        
        
    }
}