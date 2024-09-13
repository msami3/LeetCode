import java.util.Arrays;

class Solution {
    public int singleNumber(int[] nums) {
        int answer = 0;
        //edge case
        if(nums.length == 1){
            return nums[0];
        }
        
        //main algorithm is to sort and check
        Arrays.sort(nums);
        
        //iterate
        for(int i = 0; i<nums.length; i++){
            if(i==0&&nums[i]!=nums[i+1]){
                return nums[i];
            }
            else if(i==nums.length-1&&nums[i]!=nums[i-1]){
                return nums[i];
            }
            else if(nums[i]!=nums[i+1]&&nums[i]!=nums[i-1]){
                answer = nums[i];
                break;
            }
        }
        
        return answer;
    }
}