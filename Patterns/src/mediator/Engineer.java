package mediator;

public class Engineer extends Person{

	public Engineer (Mediator mediator) {
		super(mediator);
	}
	
	public void notify (String message) {
		System.out.println("Engineer has got a new message: ".concat(message));
	}
}

