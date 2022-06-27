/*
// Definition for a Node.
public class Node {
    public int val;
    public IList<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val,IList<Node> _children) {
        val = _val;
        children = _children;
    }
}
*/

public class Solution {
    public IList<int> Preorder(Node root) {
        IList<int> preOrder = new List<int>();
        Stack<Node> s = new Stack<Node>();
        Node tmp;
        
        s.Push(root);
        while (s.TryPop(out tmp) && tmp != null){
            preOrder.Add(tmp.val);
            for (int i = tmp.children.Count - 1; i >= 0; i--)
            {
                s.Push(tmp.children[i]);
            }
        }
        return preOrder;
    }
}