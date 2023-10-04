class MyHashMap {
    
    private int[] table;

    public MyHashMap() {
        this.table = new int[10000000];
        Arrays.fill(table, -1);
    }
    
    public void put(int key, int value) {
        table[key] = value;
    }
    
    public int get(int key) {
        if (table[key] != -1) return table[key];
        else return -1;
    }
    
    public void remove(int key) {
        table[key] = -1;
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */