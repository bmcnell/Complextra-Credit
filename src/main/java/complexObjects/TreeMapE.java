package complexObjects;

import java.util.TreeMap;

public class TreeMapE {
	public static void main(String[] args) {
		TreeMap<String, Rectangle> tm = new TreeMap<>();
		Rectangle r1 = new Rectangle(1,1);
		Rectangle r2 = new Rectangle(4,2);
		Rectangle r3 = new Rectangle(9, 3);
		Rectangle r4 = new Rectangle(16,4);
		tm.put("r1", r1);
		tm.put("r2", r2);
		tm.put("r3", r3);
		tm.put("r4", r4);
		System.out.println("TreeMap size after addition: " + tm.size());
		System.out.println("First item in TreeMap is: " + tm.firstKey());
	}
}
