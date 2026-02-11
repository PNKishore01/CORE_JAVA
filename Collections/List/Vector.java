import java.util.*;
public class Vector {

	public static void main(String[] args) {
		
		//creating
		Vector<String> v1 = new Vector<String>();
		//adding
		v1.add("Apple");
		v1.add("Banana");
		v1.add("Carbooza");
		v1.add("Orange");
		v1.add("Guava");
		
		Vector<String> v2 = new Vector<>();
		v2.add("Green");
		v2.add("Red");
		v2.add("White");
		v2.add("Orange");
		
		System.out.println(v1); // v1
		//v1.addAll(v2);      // v2 add into v1
		//System.out.println(v1); // v2 add into v1
		//v1.addAll(0, v2);  // v2 add into v1 from 0 index
		//System.out.println(v1); // v2 add into v1 from first index
		
		// Retrival
		//System.out.println(v1.get(2));
		
		//Deletion
		//v1.remove(3);
//		v1.removeAllElements();
		//v1.remove("Carbooza");
		//System.out.println(v1);
		
		//Verification
		//System.out.println(v1.contains("Orange"));  //returns boolean
		//System.out.println(v1.containsAll(v2));   // returns boolean
		
		//Updation
		//v1.set(3, "Grapes");
		//System.out.println(v1);
		
		//Get indexes
		//v1.indexOf("Apple");
		//v1.lastElement();
		//v1.lastIndexOf("Guava");
		//System.out.println(v1.lastIndexOf("Guava"));
		//System.out.println(v1.isEmpty()); // return boolean
		
		//size and capacity
		//System.out.println(v1.size());
		//System.out.println(v1.capacity());
		
		//vector to array
		//Object[] arr = v1.toArray();
		//System.out.println(Arrays.toString(arr));
		
		//Array to vector
//		Object[] arr = new Object[n];
//		List<Object> al = new Vector<>(Arrays.asList(arr));
		
//		Collections.max(v1);
//		Collections.min(v1);
//		Collections.shuffle(v2);
		System.out.println(v1.capacity());
	}

}
/*
 * default capacity - 10
 * initial capacity - 10
 * allow duplicates - yes
 * null values? - yes
 * maintain insertion order? - yes
 * maintain sorted order? - no
 * offer the random access of elements? - yes
 * is vector synchronized? - yes
 * multi-threading, data is increased exponentially
 */