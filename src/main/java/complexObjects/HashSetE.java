package complexObjects;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class HashSetE {
	
	public static void main(String[] args) {
		Set<Rectangle> hs = new HashSet<Rectangle>();
		Rectangle r1 = new Rectangle(1,1);
		Rectangle r2 = new Rectangle(4,2);
		Rectangle r3 = new Rectangle(9, 3);
		Rectangle r4 = new Rectangle(16,4);
		hs.add(r1);
		hs.add(r2);
		hs.add(r3);
		hs.add(r4);
		System.out.println("HashSet size after addition: " + hs.size());
	}
}
