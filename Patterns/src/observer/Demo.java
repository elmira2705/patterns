package observer;

public class Demo {
/* additional info
 * https://refactoring.guru/ru/design-patterns/observer
 * 
 */
	public static void main(String[] args) {
		Author a = new Author();
		a.subscribe(new EmailSubscriber("abc@gmail.com"));
		a.subscribe(new EmailSubscriber("dfe@gmail.com"));
		a.subscribe(new EmailSubscriber("xyz@gmail.com"));
		a.subscribe(new SMSSubscriber("+1234567890"));
		
		EmailSubscriber es = new EmailSubscriber("123@gmail.com");
		a.subscribe(es);
		a.posts();
	}

}
