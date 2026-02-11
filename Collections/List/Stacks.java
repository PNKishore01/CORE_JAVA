import java.util.*;
public class Stacks {

	public static void main(String[] args) {
		
		Stack<String> s = new Stack<>();
        //it follows last in first out(LIFO)
		//it performs all vector methods, but we can perform other methods, push, pop, peek, search
		//push 
		s.push("one");
		s.push("two");
		s.push("three");
		s.push("four");
		s.push("five");
		
		System.out.println(s);
		//pop
//		s.pop();
//		s.remove(3);
//		s.clear();
		
		//peek
		//System.out.println(s.peek());
		
		System.out.println(s.empty());
		//search
		System.out.println(s.search("four"));
		
		while(!s.isEmpty()) {
			System.out.print(s.pop() + " ");
		}
	}

}


/*
 * push - add element
 * pop - remove last element
 * peek - it returns last element
 * search - it returns index of given element in reversed way.
 * default capacity - 0
 * initial capacity - 10
 * allow duplicates - yes
 * null values? - yes
 * maintain insertion order? - yes
 * maintain sorted order? - no
 * offer the random access of elements? - yes, but we don't use.
 * is ArrayList synchronized? - yes, bcz it is a subclass of vector
 * it can  be used for stack applications.
 * */
