class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i = nums2.length-1; i >= 0; i--) {
            nums1[nums1.length-(i+1)] = nums2[i];
        }
        Arrays.sort(nums1);
    }
}