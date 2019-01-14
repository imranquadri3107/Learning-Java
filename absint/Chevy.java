package absint;

public class Chevy extends Truck{

	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return "Yellow";
	}

	@Override
	public int getTotalTireCount() {
		// TODO Auto-generated method stub
		return getTires();
	}

}
