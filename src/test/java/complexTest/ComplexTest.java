package complexTest;

import complexObjects.Rectangle;
import complexObjects.TreeComparator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import complexObjects.TreeSetE;

import org.junit.Before;
import org.junit.Test;

public class ComplexTest {
	
	Rectangle r1 = new Rectangle(1,1);
	Rectangle r2 = new Rectangle(4,2);
	Rectangle r3 = new Rectangle(9, 3);
	Rectangle r4 = new Rectangle(16,4);
	
	@Test
	public void Set_test() {
		//testing HASH set
		Set<Rectangle> hs = new HashSet<Rectangle>();
		hs.add(r1);
		hs.add(r3);
		hs.add(r4);
		assert(hs.size() == 3);
		System.out.println(hs.size() + " items in HashSet.");
		hs.remove(r4);
		assert(hs.size() == 2);
		hs.clear();
		assert(hs.isEmpty() == true);
		System.out.println("HashSet empty.");
		
		//testing TREE set
		Set<Rectangle> ts = new TreeSet<>(new TreeComparator());
		ts.add(r1);
		ts.add(r2);
		ts.add(r3);
		ts.add(r4);
		assert(r1.getArea()==(((TreeSet<Rectangle>) ts).first()).getArea());
		System.out.println(ts.size() + " items in TreeSet.");
	}
	
	@Test
	public void Map_test() {
		// testing HASH map
		HashMap<String, Rectangle> hm = new HashMap<String, Rectangle>();
		hm.put("r1", r1);
		hm.put("r2",  r2);
		//repeat key and value, should only update existing
		hm.put("r2", r1);
		assert(hm.size() == 2 );
		System.out.println(hm.size() + " items in HashMap.");
		hm.clear();
		assert(hm.isEmpty() == true);
		System.out.println("HashMap empty.");
		
		//testing TREE map
		hm.put("r1", r1);
		hm.put("r2", r2);
		hm.put("r3", r3);
		hm.put("r4", r4);
		TreeMap tm = new TreeMap<>(hm); 
		assert(tm.get("r1") == r1);
		System.out.println(tm.size() + " items in TreeMap.");
	}
	
	@Test
	public void List_test() {
		//testing ARRAY list
		ArrayList<Rectangle> al = new ArrayList<Rectangle>();
		al.add(r2);
		al.add(r3);
		al.add(r4);
		al.add(r1);
		System.out.println(al.size() + " items in ArrayList.");
		
		//testing LINKED list
		LinkedList<Rectangle> ll = new LinkedList<Rectangle>(al);
		System.out.println(ll.size() + " items in LinkedList.");
		assert(ll.getFirst() == r2);
		ll.remove(0);
		assert(ll.getFirst() != r2);
		System.out.println("LinkedList has " + ll.size() + " items left.");
		
	}
	
}
