public class Node {

    public Node(int value) {
	this.value = value;
	this.leftRef = null;
	this.rightRef = null;
    }
    
    public void setLeftRef(Node other) {
        this.leftRef = other;
    }
    
    public void setRightRef(Node other) {
        this.rightRef = other;	
    }
    
    public Node getLeftRef() {
        return leftRef;
    }
    
    public Node getRightRef() {
        return rightRef;
    }
    
    public int getValue() {
        return value;
    }
    
    public String toString() {
        return String.valueOf(value);
    }
    
    private int value;
    private Node leftRef;
    private Node rightRef;

}
