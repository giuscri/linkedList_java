public class Node {

    public Node(int value) {
	this.value = value;
	this.leftNode = null;
	this.rightNode = null;
    }
    
    public void setLeftNode(Node other) {
        this.leftNode = other;
    }
    
    public void setRightNode(Node other) {
        this.rightNode = other;	
    }
    
    public Node getLeftNode() {
        return leftNode;
    }
    
    public Node getRightNode() {
        return rightNode;
    }
    
    public int getValue() {
        return value;
    }
    
    public String toString() {
        return String.valueOf(value);
    }
    
    private int value;
    private Node leftNode;
    private Node rightNode;

}
