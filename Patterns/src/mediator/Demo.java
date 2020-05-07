package mediator;
/* see add links below
 * https://habr.com/ru/post/131579/
 */
public class Demo {
	public static void main (String [] args) {
		Mediator mediator = new Mediator();
		Person engineer = new Engineer(mediator);
		Person marketolog = new Marketolog (mediator);
		Person booker = new Booker (mediator);
		
		mediator.en = engineer;
		mediator.b = booker;
		mediator.m = marketolog;
		
		engineer.send("New product has been released");
		System.out.println();
		marketolog.send("Marketing campaign has been launched");
		
	}
}
