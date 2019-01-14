package collec;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import absint.Chevy;

public class HashMapExample {

	public static void main(String[] args) {
//		Map<String, Chevy>
		Map<Integer, String> chevyMap = new HashMap<>();
		chevyMap.put(1, "CAR");
		chevyMap.put(1000, "dskfnsdjkgf");
		System.out.println(chevyMap.get(1000));
		chevyMap.put(1000, "TRUCK");
		chevyMap.put(10, "TRUCKsdfsdf");
		chevyMap.put(100, "TRdsfsdfdUCK");
		chevyMap.put(10000, "TfrgfsfdsRUCK");
		
		System.out.println(chevyMap.get(1000));
		
		
		Set<Integer> keySet = chevyMap.keySet();
		
		Iterator<Integer> it = keySet.iterator();
		
		while(it.hasNext()) {
			System.out.println(chevyMap.get(it.next()));
		}
		
	}

}
