class Solution {
    public int[] runningSum(int[] nums) {
        var newnums= new int[nums.length];
        int sum=0;
        for(int i=0;i<nums.length;i++){
            
            sum+=nums[i];
            newnums[i]=sum;
        }
        return newnums;
    }
}