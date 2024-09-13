class Solution {
    public int mySqrt(int x) {
        int ans = 0;
        int stored = 0;
        double doubleAgent = 0.0;
        if(x==1){
            return 1;
        }
        
        long i = x/2;
        while(true){
            if(i*i==x||(i*i<x&&(i+1)*(i+1)>x)){
                ans = (int)i;
                break;
            }
            else if((i*i)>x){
                doubleAgent = (double)i;
                doubleAgent/=2;
                i/=2;
            }
            else{
                stored = (int)(doubleAgent*2.0);
                i = i+((stored-i)/2);
            }
        }
        return ans;
    }
}