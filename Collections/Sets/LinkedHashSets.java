import java.util.*;

public class LinkedHashSets {

public static void main(String[] args) {
		
		//create
	// LinkedHashSet -> LinkedHashMap -> link of nodes
		Set<Integer> hs = new LinkedHashSet<>();
		
		//add
		hs.add(46);
		hs.add(23);
		hs.add(30);
		hs.add(10);
		hs.add(87);
		hs.add(10);
		System.out.println(hs);
		
		//remove
//		hs.remove(23);
//		hs.remove(24);
		
		//verification
//		System.out.println(hs.contains(20));
//		System.out.println(hs.contains(30));
		
		//retrieval
		for(Integer value: hs) {
			System.out.println(value);
		}
		System.out.println(hs.size());
		hs.clear();
		System.out.println(hs);
		
	}

}


/*
 * default - 16
 * initial capacity - 16
 * allow duplicates - no
 *  null - yes
 * insertion - yes
 * sorted - no
 * random access - no 
 * not synchronized
 *it maintain insertion order
*/
