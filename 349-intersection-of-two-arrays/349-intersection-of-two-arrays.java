class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<Integer>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0, j = 0;
        while(i < nums1.length && j < nums2.length) {
            if(nums1[i] > nums2[j]) {
                j++;
            } else if(nums1[i] < nums2[j]) {
                i++;
            } else {
                set.add(nums2[j]);
                i++;
                j++;
            }
        }
        int[] result = new int[set.size()];
        int index = 0;
        for(Integer num: set) {
            result[index++] = num;
        }
        return result;
    }
}