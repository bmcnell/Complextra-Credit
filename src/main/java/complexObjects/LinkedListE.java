package complexObjects;

import java.util.LinkedList;

public class LinkedListE {
	public static void main(String[] args) {
		LinkedList<Rectangle> ll = new LinkedList<Rectangle>();
		Rectangle r1 = new Rectangle(1,1);
		Rectangle r2 = new Rectangle(4,2);
		Rectangle r3 = new Rectangle(9, 3);
		Rectangle r4 = new Rectangle(16,4);
		ll.add(0, r2);
		ll.add(1, r4);
		ll.add(2, r1);
		ll.add(3, r3);
		System.out.println("LinkedList size after addition: " + ll.size());
		ll.remove(1);
		System.out.println("New LinkedList size is: " + ll.size());
		
	}
}
