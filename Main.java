import java.util.*;

public class Main {

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
	Random randomGenerator = new Random();
	
	for (int i=0; i<5; i++) {
	    int nextValue = randomGenerator.nextInt(1000);
	    ll.add(new Node(nextValue));
	}
	
	System.out.println("Generated linked list: " + ll);
		
    }

}
