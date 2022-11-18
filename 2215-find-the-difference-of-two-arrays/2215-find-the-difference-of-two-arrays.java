class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> numss1 = Arrays.stream(nums1).boxed().toList();
        List<Integer> numss2 = Arrays.stream(nums2).boxed().toList();
        List<Integer> first = new ArrayList<>();
        for(int i = 0; i < nums1.length; i++) {
            if(!first.contains(nums1[i]) && !numss2.contains(nums1[i])) first.add(nums1[i]);
        }
        result.add(first);
        List<Integer> second = new ArrayList<>();
        for(int i = 0; i < nums2.length; i++) {
            if(!second.contains(nums2[i]) && !numss1.contains(nums2[i])) second.add(nums2[i]);
        }
        result.add(second);
        return result;
    }
}