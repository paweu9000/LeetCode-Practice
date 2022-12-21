class Solution {
    public int[] replaceElements(int[] arr) {
        if(arr.length == 1) {
            arr[0] = -1;
            return arr;
        }
        for(int i = 0; i < arr.length-1; i++) {
            int greatest = 0;
            for(int j = i+1; j < arr.length; j++) {
                if(arr[j] > greatest) greatest = arr[j];
            }
            arr[i] = greatest;
        }
        arr[arr.length-1] = -1;
        return arr;
    }
}