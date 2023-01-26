class Solution {
    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        List<List<Integer>> result = new ArrayList<>();
        Map<Integer, Integer> map = new TreeMap<>();
        for(int[] i: items1) {
            map.put(i[0], i[1]);
        }
        for(int[] y: items2) {
            map.put(y[0], map.getOrDefault(y[0], 0)+y[1]);
        }
        for(Map.Entry<Integer, Integer> set: map.entrySet()) {
            result.add(new ArrayList<>(Arrays.asList(set.getKey(), set.getValue())));
        }
        return result;
    }
}