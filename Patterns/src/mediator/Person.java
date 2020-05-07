package mediator;

public abstract class Person {
	Mediator mediator;
	
	public Person (Mediator mediator) {
		this.mediator = mediator;
	}
	
	// someone sends a message to mediator
	public void send (String message) {
		mediator.send(this, message);
	}
	// message from mediator to someone
	abstract public void notify (String message);
}
