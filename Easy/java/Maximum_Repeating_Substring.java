class Solution {
    public int maxRepeating(String sequence, String word) {
        String temp = word;
        int counter = 0;
        
        while(sequence.contains(temp)){
            temp = temp.concat(word);
            counter++;
        }

        return counter;
    }
}