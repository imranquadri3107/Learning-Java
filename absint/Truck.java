package absint;

public abstract class Truck {
	
	public abstract String getColor();
	
	public abstract int getTotalTireCount();
	
	public void start() {
		System.out.println("Engine Started");
	}
	
	protected int getTires(){
		return 4;
	}

}
