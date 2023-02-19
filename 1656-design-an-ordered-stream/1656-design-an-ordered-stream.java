class OrderedStream {
    private int next;
    private String[] arr;

    public OrderedStream(int n) {
        this.arr = new String[n+1];
        next = 1;
    }
    
    public List<String> insert(int idKey, String value) {
        arr[idKey] = value;
        List<String> list = new ArrayList<>();
        int key = next;
        while(key < arr.length && arr[key] != null) {
            list.add(arr[key]);
            key++;
        }
        next = key;
        return list;
    }
}

/**
 * Your OrderedStream object will be instantiated and called as such:
 * OrderedStream obj = new OrderedStream(n);
 * List<String> param_1 = obj.insert(idKey,value);
 */