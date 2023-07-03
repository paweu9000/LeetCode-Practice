class Solution {
    public boolean buddyStrings(String s, String goal) {
        if (s.length() != goal.length()) return false;
        if (s.equals(goal)) {
            Set<Character> set = new HashSet<>();
            for (char c: s.toCharArray()) set.add(c);
            return set.size() < s.length();
        }
        List<Integer> difference = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != goal.charAt(i)) difference.add(i);
        }
        return difference.size() == 2 && s.charAt(difference.get(0)) == goal.charAt(difference.get(1)) && 
            s.charAt(difference.get(1)) == goal.charAt(difference.get(0));
    }
}