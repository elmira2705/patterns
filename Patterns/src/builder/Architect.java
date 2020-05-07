package builder;

public class Architect {
	public static House getWoodenHouse() {
		HouseBuilder hb = new HouseBuilder();
		hb.setWooden(true);
		hb.setArea(100);
		hb.setFloorsCount(2);
		hb.setElectric(true);
		return hb.getHouse(); // обращение всегда по методу getHouse
	}
	
	public static House getStoneHouse() {
		HouseBuilder hb = new HouseBuilder();
		hb.setWooden(false);
		hb.setArea(570);
		hb.setFloorsCount(3);
		hb.setElectric(true);
		hb.setPool (100000, 300);
		return hb.getHouse(); // обращение всегда по методу getHouse
	}
}
