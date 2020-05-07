package mediator;

public class Mediator {
	public Person en;
	public Person b;
	public Person m;
	
	public void send (Person p, String message) {
		if (p == en) {
			m.notify("Good is launched, new marketing campaign is needed");
			b.notify("Good is launched, it needs to be taken into account");
		} else if (p == m) {
			en.notify("Marketing campaign is launched, more goods are needed");
			b.notify("Marketing campaign is launched, it needs to be taken into account");
		}
	}
}
