package collec;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		List<String> colorsList = new ArrayList<>();

		colorsList.add("yellow");
		colorsList.add("red");
		colorsList.add("red");
		colorsList.add("red");
		colorsList.add("red");
		colorsList.add("blue");

		//convert ArrayList to Array
		String[] colorsArray = colorsList.toArray(new String[colorsList.size()]);
	

		// for(int i=0; i< colorsList.size(); i++) {
		// System.out.println("i= " + i + " = " +colorsList.get(i));
		// }

		for (String color : colorsList) {
			System.out.println("color = " + color);
			if (color.equalsIgnoreCase("red")) {
				break;
			}
		}

		Iterator<String> it = colorsList.iterator();

		while (it.hasNext()) {
			String color = it.next();
			System.out.println("Color = " + color);
		}

		int i = 0;
		while (i < colorsList.size()) {
			System.out.println(colorsList.get(i));
			i++;
		}

		boolean notFound = true;
		Iterator<String> itWhile = colorsList.iterator();
		while (notFound) {
			if (itWhile.hasNext()) {
				String col = itWhile.next();
				if (col.equalsIgnoreCase("red")) {
					notFound = false;
					System.out.println(col);
				}
			}
		}

	}

}
