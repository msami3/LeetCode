class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> myListofList = new ArrayList<List<String>>();
        HashMap<String, List<String>> totalMap = new HashMap<>();
        
        for(String currString: strs){
            List<String> myList = new ArrayList<>();
            char[] chars = currString.toCharArray();
            Arrays.sort(chars);
            String sortedWord = new String(chars);

            if(!totalMap.containsKey(sortedWord)){
                myList.add(currString);
                totalMap.put(sortedWord, myList);
            }else{
                myList = totalMap.get(sortedWord);
                myList.add(currString);
            }
        }

        for(List<String> value : totalMap.values()){
            myListofList.add(value);
        }

        return myListofList;
    }

}