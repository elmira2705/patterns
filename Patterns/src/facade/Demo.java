package facade;
/*additional info
 * https://refactoring.guru/ru/design-patterns/facade
 */

public class Demo {

	public static void main(String[] args) {
		double kzt = 50_000;
		double cad = Facade.kztToCAD(kzt);
		System.out.println(cad);

	}

}
