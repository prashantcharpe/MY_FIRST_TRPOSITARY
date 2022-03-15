package Map;

import java.util.TreeMap;

public class SortedMapExample {

	public static void main(String[] args) {

		TreeMap<Integer, String> obj = new TreeMap<Integer, String>();

		obj.put(1, "one");
		obj.put(2, "two");
		obj.put(3, "three");
		obj.put(4, "four");
		obj.put(5, "five");
		obj.put(6, "six");
		obj.put(7, "seven");
		System.out.println("total map : " + obj + "\n");

		// firstEntry() & lastEntry()
		System.out.println("Firstentry() return only  1st key&value :" + obj.firstEntry());
		System.out.println("Lastentry() return only Last key&value :" + obj.lastEntry() + "\n");

		// firstKey() & lastKey()
		System.out.println("FirstKey() return only 1st key :" + obj.firstKey());
		System.out.println("Lastentr() return only last key&value :" + obj.lastKey() + "\n");

		// headMap()
		System.out.println("headMap() return less  key&value from given entries :" + obj.headMap(3));

		// tailMap()
		System.out.println("tailMap() return equal and greater key&value from given entries :" + obj.tailMap(4));

		// subMap()
		System.out.println("subMap() return key&value between given two entries :" + obj.subMap(3 , 6));

	}
}
