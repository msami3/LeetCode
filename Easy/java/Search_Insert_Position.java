class Solution {
    public int searchInsert(int[] nums, int target) {
        int result = 0;
        if(nums[0]>target){
            return result;
        }
        
        if(nums[nums.length-1]<target){
            return nums.length;
        }
        
        for(int i = 1; i<nums.length; i++){
            if(target==nums[i]){
                return i;
            }
            else if(nums[i-1]<target&&nums[i]>target){
                result=i;
            }
            
        }
        
        return result;
    }
}