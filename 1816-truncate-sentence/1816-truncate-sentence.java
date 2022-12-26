class Solution {
    public String truncateSentence(String s, int k) {
        String[] arr = s.split(" ");
        String result = "";
        for(int i = 0; i < k; i++) {
            if(i == k-1) {
                result += arr[i];
            } else {
                result += arr[i] + " ";   
            }
        }
        return result;
    }
}