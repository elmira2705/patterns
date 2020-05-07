package observer;

import java.util.ArrayList;

public class Author {
	public ArrayList<Subscriber> list = new ArrayList();
	
	public void subscribe (Subscriber s) {
		list.add(s);
	}
	
	public void unsubscribe(Subscriber s) {
		list.remove(s);
	}
	
	public void posts () {
		for (Subscriber s: list) {
			s.update ("New post on the blog");
		}
	}
}
