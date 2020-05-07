package builder;

public class House {
	public boolean isWooden;
	public boolean isElectric;
	public int area;
	public int floorsCount;
	public int poolArea;
	public int poolValue;
	
	public String toString() {
		String s = "\n You have built the following house: ";
		if (isWooden) s+= "\n it's wooden; ";
		else s+= "\n it's from stone; ";
		if (isElectric) s+= " \n electricity is connected; ";
		else s+= "\n electricity is not connected yet; ";
		s+= "\n area is " + area + "m^2; ";
		s+= "\n count of floors: " + floorsCount;
		if (poolArea != 0) {
			s+= "\n it's pool's area is " + poolArea + "m^2 ";
			s+= "with the value of " + poolValue + "L";
		}
		return s;
	}
	
	
	
}
