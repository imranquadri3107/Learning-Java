package absint;

public class Ford extends Truck{

	@Override
	public String getColor() {
		return "blue";
	}

	@Override
	public int getTotalTireCount() {
		// TODO Auto-generated method stub
		return getTires()+2;
	}

}
