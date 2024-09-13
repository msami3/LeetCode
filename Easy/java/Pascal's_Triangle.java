class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        List<Integer> temp = new ArrayList<Integer>();
        temp.add(1);
        ans.add(new ArrayList(temp));
        if(numRows == 1){
            return ans;
        }
        temp.add(1);
        ans.add(new ArrayList(temp));
        if(numRows == 2){
            return ans;
        }
        int indexTemp=0;
        int indexAns = 4;
        for(int i = 2; i < numRows; i++){
            temp.clear();
            temp.add(1);
            for(int j = 0; j<i-1; j++){
                temp.add(ans.get(i-1).get(j) + ans.get(i-1).get(j+1));
            }
            temp.add(1);
            ans.add(new ArrayList(temp));
        }
        return ans;
    }
}