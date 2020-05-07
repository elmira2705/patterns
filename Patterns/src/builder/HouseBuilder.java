package builder;

public class HouseBuilder {
	
	private House house;
	
	public HouseBuilder() {
		reset();
	}
	
	public void reset() {
		house = new House();
	}
	
	public void setWooden (boolean isWooden) {
		house.isWooden = isWooden;
	}
	
	public void setElectric (boolean isElectric) {
		house.isElectric = isElectric;
	}
	
	public void setArea (int area) {
		house.area = area;
	}
	
	public void setFloorsCount (int floorsCount) {
		house.floorsCount = floorsCount;
	}
	
	public void setPool (int poolArea, int poolValue) {
		house.poolArea = poolArea;
		house.poolValue = poolValue;
	}
	// через этот метод обращаемся к объекту
	public House getHouse() {
		return house;
	}

}
