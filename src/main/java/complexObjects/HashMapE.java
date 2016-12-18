package complexObjects;

import java.util.HashMap;

public class HashMapE {
	public static void main(String[] args) {
		HashMap<String, Rectangle> hm = new HashMap<String, Rectangle>();
		Rectangle r1 = new Rectangle(1,1);
		Rectangle r2 = new Rectangle(4,2);
		Rectangle r3 = new Rectangle(9, 3);
		Rectangle r4 = new Rectangle(16,4);
		hm.put("r1", r1);
		hm.put("r2",  r2);
		hm.put("r3",  r3);
		hm.put("r4",  r4);
		System.out.println("HashMap size after addition: " + hm.size());
		System.out.println("First item is: " + hm.get("r1"));
		hm.clear();
		System.out.println("HashMap size after clear: " + hm.size());
	}
	
}
