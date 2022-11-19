import java.util.HashMap;
import java.util.Set;

class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i: arr) {
            map.put(i, 1 + map.getOrDefault(i, 0));
        }
        Set<Object> uniqueValues = new HashSet<Object>(map.values());
        return(uniqueValues.size() == map.size());
    }
}