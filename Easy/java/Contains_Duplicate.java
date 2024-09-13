class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> numsMap = new HashMap<>();
        int n = nums.length;

        for(int i = 0; i < n; i++){
            if(numsMap.containsKey(nums[i])){
                return true;
            }
            numsMap.put(nums[i], i);
        }

        return false;
    }
}