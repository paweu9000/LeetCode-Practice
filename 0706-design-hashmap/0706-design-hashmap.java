import static java.util.Objects.hash;

class MyHashMap {
    
    private Node[] table;
    
    class Node {
        final int hashed;
        final int key;
        final int value;
        
        public Node(int hashed, int key, int value) {
            this.hashed = hashed;
            this.key = key;
            this.value = value;
        }
    }

    public MyHashMap() {
        this.table = new Node[10000000];
    }
    
    public void put(int key, int value) {
        int hashedKey = hash(key);
        table[hashedKey] = new Node(hashedKey, key, value);
    }
    
    public int get(int key) {
        int hashedKey = hash(key);
        Node val = table[hashedKey];
        return val == null ? -1 : val.value;
    }
    
    public void remove(int key) {
        int hashedKey = hash(key);
        table[hashedKey] = null;
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */