class Solution {
    public int calPoints(String[] operations) {
        LinkedList<Integer> nums = new LinkedList<>();
        int sum = 0;
        for(String x: operations) {
            if(x.equals("C")) {
                sum -= nums.removeLast();
            } else if(x.equals("+")) {
                nums.add(nums.get(nums.size() - 2) + nums.peekLast());
                sum += nums.peekLast();
            } else if(x.equals("D")) {
                nums.add(nums.peekLast() * 2);
                sum += nums.peekLast();
            } else {
                nums.add(Integer.parseInt(x));
                sum += nums.peekLast();
            }
        }
        return sum;
    }
}