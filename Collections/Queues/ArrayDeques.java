
import java.util.*;

public class ArrayDeques {

public static void main(String[] args) {
		//creation
		Deque<String> q = new ArrayDeque<>();
		
		//adding
		q.add("Banana");
	    q.addFirst("Apple");
	    q.addLast("Guava");
	    q.offer("Mango");
	    q.offerFirst("Grapes");
	    q.offerLast("Kiwi");
	    
	    System.out.println(q);
	    
//	    //retrieval
//	    System.out.println(q.peek());
//	    System.out.println(q.peekFirst());
//	    System.out.println(q.peekLast());
//	    
//	    //removal
//	    q.poll();
//	    q.pollFirst();
//	    q.pollLast();
//	    q.remove();
//	    q.removeFirst();
//	    q.removeLast();
	    
	    //verification
	    System.out.println(q.contains("Apple"));
	    System.out.println(q.contains("peer"));
	    
	    System.out.println(q.size());
	}

}


/*
 * default & initial capacity - 17
 * allow duplicates, but not null
 * it doesn't maintain insertion,sorted,random access
 * not synchronized
 * it is good at adds first & last
*/

