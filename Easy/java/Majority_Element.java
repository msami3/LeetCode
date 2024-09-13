import java.util.HashMap;
import java.util.Map.Entry;
class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        
        for(int i = 0; i<nums.length; i++){
            if(mp.containsKey(nums[i])){
                mp.put(nums[i], mp.get(nums[i])+1);
            }
            else{
                mp.put(nums[i], 1);
            }
        }
        
        int value = Collections.max(mp.values());
        int ans = 0;
        for (Entry<Integer, Integer> entry : mp.entrySet()) {
            if (entry.getValue()==value) {
                ans = entry.getKey();
        }
    }
        
        return ans;
        
    }
}