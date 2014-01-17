import java.util.*;

public class LinkedList {

    public LinkedList() {
        first = null;
	last = first;
    }

    public void link(Node n) {
        Node tmp = null;
	for (tmp=first; tmp.getRightNode()!=null; tmp=tmp.getRightNode())
	    ;
	tmp.setRightNode(n);
	n.setLeftNode(tmp);
    }
    
    public boolean isEmpty() {
        return first == null;
    }
    
    public void add(Node n) {
    
        if (this.isEmpty()) {
	    first = n;
	    last = first;
	}
    
    
	if (n.getValue() < first.getValue()) {
	    first.setLeftNode(n);
	    n.setRightNode(first);
	    first = n;
	    return;
	}
	
	Node tmp = first.getRightNode();
	for (; tmp!=null; tmp=tmp.getRightNode()) {
	    if (n.getValue() < tmp.getValue()) {
	        tmp.getLeftNode().setRightNode(n);
		n.setLeftNode(tmp.getLeftNode());
		n.setRightNode(tmp);
		tmp.setLeftNode(n);
		return;
	    }
	}
	
	if (last.getValue() < n.getValue()) {
	    last.setRightNode(n);
	    n.setLeftNode(last);
	    last = n;
	    return;
	}
    }

    public String toString() {
    
        StringBuffer sb = new StringBuffer("[  ");
    
        Node tmp = first;
	for (; tmp!=null; tmp=tmp.getRightNode())
	    sb.append(tmp+"  ");
	
	sb.append("]");
	
	return sb.toString();
    }
    
    public Node getFirst() {
        return first;
    }
    
    public Node getLast() {
        return last;
    }
    
    private Node first;
    private Node last;
}
