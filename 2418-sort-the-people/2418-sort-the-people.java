class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        HashMap<Integer, String> map = new HashMap<>();
        for(int i = 0; i < names.length; i++) {
            map.put(heights[i], names[i]);
        }
        String[] result = new String[names.length];
        Arrays.sort(heights);
        int index = 0;
        for(int i = result.length-1; i >= 0; i--) {
            result[index] = map.get(heights[i]);
            index++;
        }
        return result;
    }
}