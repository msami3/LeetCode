class Solution {
    public int numberOfSpecialChars(String word) {
        HashSet<Integer> mySet = new HashSet<Integer>();
        int size = word.length();
        int result = 0;

        for(int i = 0; i < size; i++){
            int currentVal = (int) word.charAt(i);

            if(!mySet.contains(currentVal) && (mySet.contains(currentVal - 32) || mySet.contains(currentVal + 32))){
                result ++;
            }

            mySet.add(currentVal);
        }

        return result;
    }
}