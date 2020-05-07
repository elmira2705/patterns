 package builder;
//https://refactoring.guru/ru/design-patterns/builder - additional info
// разобраться с final instance vars https://habr.com/ru/post/244521/

 public class Demo {

	public static void main(String[] args) {
		HouseBuilder hb1 = new HouseBuilder();
		
		hb1.setWooden(true);
		hb1.setArea(50);
		hb1.setFloorsCount(1);
		hb1.setElectric(false);
		System.out.println(hb1.getHouse());
		
		System.out.println(Architect.getWoodenHouse());
		
		System.out.println(Architect.getStoneHouse());
		

	}

}
