import java.util.*;

public class LinkedHashMaps {

/**
 * It is a predefined class present in “ UTIL “ package.
It will store the values in the form of key value pairs.
It will follow insertion order of elements.
Here duplicates are not allowed but values might be duplicate it will allow single null
key but multiple null values, it internally uses hash table and linked list as data
structure for storing the elements.
The initial capacity of linked list is 16 and load factor is 0.75.
 */


public static void main(String[] args) {
		
		//creation of map
		Map<Integer, String> m = new LinkedHashMap<>();

		//add of elements 
		m.put(101, "Lion");
		m.put(102, "Tiger");
		m.put(103, "Liger");
		m.put(104, "Elephant");
		System.out.println(m);
		
		//retrieval keys
		System.out.println(m.keySet());
		
		//you can iterate also by using key set
		Set<Integer> s = m.keySet();
		for(Integer key: s) {
			System.out.println(key);
		}
		
		//retrieval values
		System.out.println(m.values());
		//you can iterate also by using keyset
		Collection<String> strs = m.values();
		for(String value: strs) {
			System.out.println(value);
		}
		
		//you can iterate also by using entrySet
		Set<Map.Entry<Integer, String>> enteries = m.entrySet();
		for(Map.Entry<Integer, String> entry: enteries) {
			Integer key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key + " --- " + value);
		}
		
		//retrieval values based on key
		System.out.println(m.get(101));
		//iterate also
		for(Integer key : s) {
			System.out.println(key + " --- " + m.get(key));
		}
		
		//deletion of elements
		m.remove(101);
		System.out.println(m);
		
		//verification of keys
		System.out.println(m.containsKey(102));
		System.out.println(m.containsKey(201));
		
//		//verification of values
		System.out.println(m.containsValue("Liger"));
		System.out.println(m.containsValue("Monkey"));
		
		//updation
		m.put(103, "Deer");
		System.out.println(m);
		//if value is present in specified key so they not update, otherwise it will create
		m.putIfAbsent(105, "dog");
		System.out.println(m);
		System.out.println(m.size());
		m.clear();
		System.out.println(m);
		
	}
}
