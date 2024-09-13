class Solution {
    public boolean checkPerfectNumber(int num) {

        int target = 0;
        
        for(int i = 1; i<=num/2; i++){
            if(((double) num/(double) i) == (num/i)){
                target+=i;
            }
        }

        if(target == num){
            return true;
        }

        return false;
    }
}