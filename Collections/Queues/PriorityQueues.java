import java.util.*;

public class PriorityQueues{

	public static void main(String[] args) {
		
		//creation
        Queue<Integer> q = new PriorityQueue<>();
		//Queue<Integer> q = new PriorityQueue<>(Comparator.reverseOrder());
		//add 
		q.add(10);
		q.offer(75);
		q.add(18);
		q.offer(62);
		System.out.println(q);
		
		//peek - it returns highest priority value(head value)
//		System.out.println(q.peek());
//		
//		//poll - it remove first value(fifo)
//		q.poll();
//		q.remove();
		
//		//verification
//		System.out.println(q.contains(20));
//		System.out.println(q.contains(75));
		
//		//it returns ascending order but not for loop
//		while(!q.isEmpty()) {
//			System.out.println(q.poll());
//		}
		
//		// it returns descending order but you have to change the creation a queue
//		while(!q.isEmpty()) {
//			System.out.println(q.poll());
//		}
		System.out.println(q.size());
		System.out.println(q);
	}

}


/*
 * default & initial capacity - 11
 * allow duplicates, but not null
 * it doesn't maintain insertion,sorted,random access
 * not synchronized
 * it is good at priorities
*/
