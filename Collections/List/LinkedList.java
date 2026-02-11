import java.util.*;
public class LinkedList {

    //it will maintain insertion order
	public static void main(String[] args) {
		//creating
		List<String> ll = new LinkedList<>();
		//adding
		ll.add("A");
		ll.add("B");
		ll.add("C");
		ll.add("D");
		System.out.println(ll);
		
		//delete
		//ll.remove(3);
//		ll.remove("C");
//		ll.clear();
		
		//retrieval
//		System.out.println(ll.getFirst());
//		System.out.println(ll.getLast());
//		System.out.println(ll.get(3));
		
		//verifications
//		System.out.println(ll.contains("B"));
//		System.out.println(ll.containsAll(ll));
		
		//update
//		ll.set(2, "D");
//		ll.set(3, "Z");
//		ll.set(4, null);
		System.out.println(ll.isEmpty());
		System.out.println(ll);
	}

}
