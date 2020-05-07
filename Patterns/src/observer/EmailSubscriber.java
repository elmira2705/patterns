package observer;

public class EmailSubscriber implements Subscriber {
	public String email;
	
	public EmailSubscriber (String email) {
		this.email  = email;
	}

	@Override
	public void update(String message) {
		System.out.println("Sending a message "+ message +" on the email "+ email);
		
	}
	
	
}
