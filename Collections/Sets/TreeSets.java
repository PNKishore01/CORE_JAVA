import java.util.*;

public class TreeSets {

public static void main(String[] args) {
		
		//create
	// TreeSet -> TreeMap -> binary tree
		TreeSet<Integer> hs = new TreeSet<>();
		
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
//		hs.pollFirst(); //it delete first value
//		hs.pollLast(); //it delete last value
		
		//verification
//		System.out.println(hs.contains(20));
//		System.out.println(hs.contains(30));
		
//		hs.first(); // it returns first value
//		hs.last(); // it returns last value
//		hs.descendingSet(); // it returns descending order
//		hs.subSet(4, 40); // it takes range, not index
		
		
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
 * default - 0
 * initial capacity - 0
 * allow duplicates - no
 *  null - no
 * insertion - no
 * sorted - yes
 * random access - no 
 * not synchronized
 *it maintain sorted order
*/
