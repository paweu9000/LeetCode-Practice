class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int toCheck = 0;
        int result = 0;
        switch(ruleKey) {
                case("type"): toCheck = 0; break;
                case("color"): toCheck = 1; break;
                case("name"): toCheck = 2; break;
            default: toCheck = 0;
        }
        for(int i = 0; i < items.size(); i++) {
            if(items.get(i).get(toCheck).equals(ruleValue)) {
                result++;
            }
        }
        return result;
    }
}