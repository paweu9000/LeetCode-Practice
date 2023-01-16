class Solution {
    public int wateringPlants(int[] plants, int capacity) {
        int water = capacity, len = plants.length, result = 0;
        for(int i = 0; i < len; i++) {
            if(plants[i] > water) {
                result += (2*i);
                water = capacity;
            }
            result += 1;
            water -= plants[i];
        }
        return result;
    }
}