class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> answer = new ArrayList<>();
        for(int i = left; i <= right; i++) {
            boolean isSelfDividing = true;
            String nums = String.valueOf(i);
            for(int j = 0; j < nums.length(); j++) {
                int num = Character.getNumericValue(nums.charAt(j));
                if(num != 0) {
                    if(i % num != 0) isSelfDividing = false;   
                } else {
                    isSelfDividing = false;
                }
            }
            if(isSelfDividing) answer.add(i);
        }
        return answer;
    }
}