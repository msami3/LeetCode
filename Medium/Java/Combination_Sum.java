class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList();
	    
        tree(candidates, 0, target, result, new ArrayList());
        
        return result;
    }
    
    private void tree(int[] cand, int index, int target, List<List<Integer>> result, List<Integer> list){
        if(target < 0){
            return;
        }
        
        if(target == 0){
            result.add(new ArrayList(list));
        }
        
        for(int i = index; i<cand.length; i++){
            list.add(cand[i]);
            tree(cand, i, target - cand[i], result, list);
            list.remove(list.size() - 1);
        }
    }
}