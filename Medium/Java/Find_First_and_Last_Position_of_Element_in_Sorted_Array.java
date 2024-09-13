class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = -1;
        int second = -1;
        int[] result = new int[2];
        for(int i = 0; i < nums.length; i++){
            if(nums[nums.length-1] == target && second == -1){
                second = nums.length -1;
            }
            if(nums[i] == target && first == -1){
                first = i;
            }
            if(nums[i] == target && second == -1 && nums[i+1] != target){
                second = i;
            }
        }
        result[0] = first;
        result[1] = second; 
    
        return result;
    }
}