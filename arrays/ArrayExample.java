package arrays;

public class ArrayExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] colors = new String[5];
		colors[3] = "yellow";
		colors[0] = "red";
		
		for(int i=0; i < colors.length; i++) {
			System.out.println("i= " + i + " = " + colors[i]);
		}
		
		
	}

}
