class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for(int i = 0; i < image.length; i++) {
            int[] copy = Arrays.copyOf(image[i], image[i].length);
            int len = image[i].length - 1;
            for(int x = 0; x < image[i].length; x++) {
                image[i][x] = copy[len-x];
            }
            for(int j = 0; j < image[i].length; j++) {
                image[i][j] = image[i][j] == 0 ? 1 : 0;
            }
        }
        return image;
    }
}