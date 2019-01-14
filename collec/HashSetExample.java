package collec;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<String> colorSet = new HashSet<>();
		
		
		colorSet.add("blue");
		colorSet.add("red");
		colorSet.add("yellow");
		colorSet.add(null);
		colorSet.add("ree");
		colorSet.add("red");
		colorSet.add("blue");
		colorSet.add(null);
		
		Iterator it = colorSet.iterator();
		while(it.hasNext()) {
		
		System.out.println(it.next());
	}
	}
}
