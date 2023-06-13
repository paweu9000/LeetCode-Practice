class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>>[] result = new ArrayList[target+1];
        
        for (int i = 0; i <= target; i++) {
            result[i] = new ArrayList<>();
            List<List<Integer>> combinations = new ArrayList<>();
            for (int j = 0; j < candidates.length && candidates[j] <= i; j++) {
                if (candidates[j] == i) {
                    combinations.add(Arrays.asList(candidates[j]));
                } else {
                    for (List<Integer> list : result[i - candidates[j]]) {
                        if (candidates[j] >= list.get(list.size()-1)) {
                            List temp = new ArrayList<>(list);
                            temp.add(candidates[j]);
                            combinations.add(temp);
                        }
                    }
                }
            }
            result[i] = combinations;
        }
        return result[target];
    }
}