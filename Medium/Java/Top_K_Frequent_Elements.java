import java.util.Collections;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> myMap = new HashMap<>();
        int[] ans = new int[k];

        for(int n : nums) myMap.put(n, myMap.getOrDefault(n, 0)+1);

        int[] totalArray = new int[myMap.size()];
        int index = 0;

        for(int value : myMap.values()){
            totalArray[index] = value;
            index++;
        }

        Arrays.sort(totalArray);
       
        index = totalArray.length - 1 ;
        
        for(int i = 0; i < k; i++){
            for(Map.Entry<Integer, Integer> entry : myMap.entrySet()){
                System.out.println("Number: "+ entry.getKey() + ", Frequency: " + entry.getValue());
                System.out.println("Current Highest Count: "+totalArray[index]);
                if(entry.getValue() == totalArray[index]){
                    System.out.println("Lets add to arr["+i+"] the number: "+entry.getKey());
                    if(i == k) break;
                    ans[i] = entry.getKey();
                    index--;
                    i++;
                }
            }
            if(i==k) break;
            i--;
        }

        return ans;
        
    }
}