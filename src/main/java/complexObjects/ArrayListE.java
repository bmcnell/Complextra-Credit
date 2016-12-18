package complexObjects;

import java.util.ArrayList;

public class ArrayListE {
	public static void main(String[] args) {
		ArrayList<Rectangle> al = new ArrayList<Rectangle>();
		Rectangle r1 = new Rectangle(1,1);
		Rectangle r2 = new Rectangle(4,2);
		Rectangle r3 = new Rectangle(9, 3);
		Rectangle r4 = new Rectangle(16,4);
		al.add(r1);
		al.add(r2);
		al.add(r3);
		al.add(r4);
		System.out.println("ArrayList size after addition: " + al.size());
	}
}
