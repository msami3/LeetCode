class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> smallSet = new HashSet<>();
        Map<Integer, Integer> largeMap = new HashMap<>();

        int[] smallerArray;
        int[] largerArray;

        if(nums1.length > nums2.length){
            smallerArray = nums2;
            largerArray = nums1;
        } else {
            smallerArray = nums1;
            largerArray = nums2;
        }

        List<Integer> result = new ArrayList<>();

        for(int i = 0; i < smallerArray.length; i++){
            smallSet.add(smallerArray[i]);
        }

        for(int i = 0; i < largerArray.length; i++){
            if(!largeMap.containsValue(largerArray[i])){
                largeMap.put(i, largerArray[i]);
            }
        }
        System.out.println(smallSet);
        System.out.println(largeMap);


        
        for(int i = 0; i < largerArray.length; i++){
            if(smallSet.contains(largeMap.get(i))){
                result.add(largerArray[i]);
            }
        }
        System.out.println(result);

        int[] answer = new int[result.size()];

        for(int i = 0; i < result.size(); i++){
            answer[i] = result.get(i);
        }

        return answer;
    }
}