package mediator;

public class Booker extends Person{

	public Booker (Mediator mediator) {
		super(mediator);
	}
	
	public void notify (String message) {
		System.out.println("Booker has got a new message: ".concat(message));
	}
}

