import java.util.*;

public class LinkedList {

    public LinkedList() {
        first = null;
	last = first;
    }

    public void link(Node n) {
        Node tmp = null;
	for (tmp=first; tmp.getRightRef()!=null; tmp=tmp.getRightRef())
	    ;
	tmp.setRightRef(n);
	n.setLeftRef(tmp);
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
	    first.setLeftRef(n);
	    n.setRightRef(first);
	    first = n;
	    return;
	}
	
	Node tmp = first.getRightRef();
	for (; tmp!=null; tmp=tmp.getRightRef()) {
	    if (n.getValue() < tmp.getValue()) {
	        tmp.getLeftRef().setRightRef(n);
		n.setLeftRef(tmp.getLeftRef());
		n.setRightRef(tmp);
		tmp.setLeftRef(n);
		return;
	    }
	}
	
	if (last.getValue() < n.getValue()) {
	    last.setRightRef(n);
	    n.setLeftRef(last);
	    last = n;
	    return;
	}
    }

    public String toString() {
    
        StringBuffer sb = new StringBuffer("[  ");
    
        Node tmp = first;
	for (; tmp!=null; tmp=tmp.getRightRef())
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
