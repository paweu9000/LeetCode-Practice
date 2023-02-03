class MyHashSet {
    
    private List<Integer> keys;
        
    public MyHashSet() {
        keys = new ArrayList<>();
    }
    
    public void add(int key) {
        if(!contains(key)) keys.add(key);
    }
    
    public void remove(int key) {
        for(int i = 0; i < keys.size(); i++) {
            if(keys.get(i) == key) {
                keys.remove(i);
            }
        }
    }
    
    public boolean contains(int key) {
        for(int i = 0; i < keys.size(); i++) {
            if(keys.get(i) == key) return true;
        }
        return false;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */