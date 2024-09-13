class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> myMap = new HashMap<>();
        int compliment;
        int solution[] = new int[2]; 

        for(int i = 0; i < nums.length; i++){
            compliment = target - nums[i];
            if(myMap.containsKey(compliment)){
                solution[0] = myMap.get(compliment);
                solution[1] = i;

                break;
            } 

            myMap.put(nums[i], i);
        }

        return solution;
    }
}