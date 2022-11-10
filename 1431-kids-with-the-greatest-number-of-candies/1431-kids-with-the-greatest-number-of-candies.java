class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int greatest = -1;
        for(int i = 0; i < candies.length; i++) {
            if(candies[i] > greatest) {
                greatest = Math.max(candies[i], greatest);
            }
        }
        List<Boolean> result = new ArrayList<>();
        for(int j = 0; j < candies.length; j++) {
            result.add(candies[j] + extraCandies >= greatest);
        }
        return result;
    }
}