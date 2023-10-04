class MinStack {
    
    private Node head;
    
    class Node {
        int value;
        int min;
        Node next;
        
        private Node(int value, int min, Node next) {
            this.value = value;
            this.min = min;
            this.next = next;
        }
    }
    
    public void push(int val) {
        if (head == null) {
            this.head = new Node(val, val, null);
        } else {
            int min = val < head.min ? val : head.min;
            var newNode = new Node(val, min, head);
            head = newNode;
        }
    }
    
    public void pop() {
        head = head.next;
    }
    
    public int top() {
        return head.value;
    }
    
    public int getMin() {
        return head.min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */