import java.util.Arrays;

class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> result = new ArrayList<>();
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length-1; i++) {
            int difference = arr[i+1] - arr[i];
            if(difference < min) {
                min = difference;
                result.clear();
                result.add(Arrays.asList(arr[i], arr[i+1]));
            } else if (difference == min) {
                result.add(Arrays.asList(arr[i], arr[i+1]));
            }
        }
        return result;
    }
}