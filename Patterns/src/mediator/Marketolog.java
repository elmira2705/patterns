package mediator;

public class Marketolog extends Person{

	public Marketolog (Mediator mediator) {
		super(mediator);
	}
	
	public void notify (String message) {
		System.out.println("Marketolog has got a new message: ".concat(message));
	}
}

