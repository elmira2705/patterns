package observer;

public class SMSSubscriber implements Subscriber {
	public String phone;
	
	public SMSSubscriber (String phone) {
		this.phone  = phone;
	}

	@Override
	public void update(String message) {
		System.out.println("Sending a message "+ message+ "on the phone "+phone);
		
	}

}
