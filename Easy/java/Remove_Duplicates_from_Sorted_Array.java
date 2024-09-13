class Solution {
    public int removeDuplicates(int[] nums) {
        int size = nums.length;
        int[] temp = new int[size];
        int index = 0;
        for(int i = 0; i<size; i++){
            if(i == size-1){
                temp[index]=nums[i];
                index++;
            }
            else if(nums[i]!=nums[i+1]){
                temp[index]=nums[i];
                index++;
            }
        }
        for(int i = 0; i<temp.length; i++){
            nums[i]=temp[i];
        }
        return index;
    }
}