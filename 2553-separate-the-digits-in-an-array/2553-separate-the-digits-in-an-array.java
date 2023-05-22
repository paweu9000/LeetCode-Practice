class Solution {
    public int[] separateDigits(int[] nums) {
        List<Integer> digits = new ArrayList<>();
        for(int i: nums) {
            List<Integer> toAdd = toDigits(i);
            for(int y = 0; y < toAdd.size(); y++) {
                digits.add(toAdd.get(y));
            }
        }
        int[] result = new int[digits.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = digits.get(i);
        }
        return result;
    }
    
    public List<Integer> toDigits(int num) {
        String str = Integer.toString(num);
        String[] nums = str.split("");
        List<Integer> numsToInt = new ArrayList<>();
        
        for (String x: nums) {
            numsToInt.add(Integer.parseInt(x));
        }
        return numsToInt;
    }
}