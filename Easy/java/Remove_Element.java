class Solution {
    public int removeElement(int[] nums, int val) {
        int size  = nums.length;
        int count = 0;
        
        for(int i = 0; i<size; i++){
            if(nums[i]!=val){
                nums[count]=nums[i];
                count++;
            } 
        }
        
        return count;
    }
}