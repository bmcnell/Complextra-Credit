package complexObjects;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

import complexObjects.Rectangle;

public class TreeSetE {
	public static void main(String[] args) {
		Set<Rectangle> ts = new TreeSet<>(new TreeComparator());
		Rectangle r1 = new Rectangle(1,1);
		Rectangle r2 = new Rectangle(4,2);
		Rectangle r3 = new Rectangle(9, 3);
		Rectangle r4 = new Rectangle(16,4);
		ts.add(r1);
		ts.add(r2);
		ts.add(r3);
		ts.add(r4);
		System.out.println("TreeSet size after addition: " + ts.size());
		ts.remove(r2);
		System.out.println("New TreeSet size: " + ts.size());
		}
	}
