package Map;

import java.util.TreeMap;

public class NavigableMapExample {

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
		
		//ceilingEntry() & ceilingkey()
		System.out.println("ceilingEntry() return only given entries key&value :" +obj.ceilingEntry(2));
		System.out.println("ceilingkey() return only given entries key :" +obj.ceilingKey(3)+ "\n");
		
		//descendingKeySet() & descendingMap()
		System.out.println("descendingKeySet() return all key in descending form :" +obj.descendingKeySet());
		System.out.println("descendingMap() return all key&value in descending form :" +obj.descendingMap()+ "\n");

		//headMap() & lowerEntry() & lowerKey()
		System.out.println("headMap() return all key&value less than from given entries :" +obj.headMap(3));
		System.out.println("lowerEntry() return only one key&value  less than from given entries :" +obj.lowerEntry(3));
		System.out.println("lowerKey() return only one key  less than from given entries :" +obj.lowerKey(6)+ "\n");
		System.out.println(obj.headMap(3, true));
		
		//higherEntry() & higherKey()
		System.out.println("higherEntry() return only one key&value  greater than from given entries :" +obj.higherEntry(6));
		System.out.println("higherKey() return only one key  greater than from given entries :" +obj.higherKey(6)+ "\n");
		
		//pollFirstEntry() & pollLastEntry()
		System.out.println("pollFirstEntry() return only 1st key&value  from given entries :" +obj.pollFirstEntry());
		System.out.println("pollLastEntry() return only last key&value  from given entries :" +obj.pollLastEntry()+"\n");
		
		System.out.println("SubMAP() return between equal=2 & less<6 key&value from given entries :" +obj.subMap(2, 6));
		
	}
}
