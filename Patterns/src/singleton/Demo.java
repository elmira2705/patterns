package singleton;

public class Demo {
	
	public static void main(String[] args) {
		Singleton s = Singleton.getSingleton();
		System.out.println(s.x);	
		
		s.x = 20;
		System.out.println(s.x);	
		
		Singleton s2 = Singleton.getSingleton();
		System.out.println(s2.x);	
		
		System.out.println();
		//2
		Singleton2 s3 = Singleton2.getSingleton2();
		System.out.println(s3.x);	
		
		s3.x = 30;
		System.out.println(s3.x);	
		
		Singleton2 s4 = Singleton2.getSingleton2();
		System.out.println(s4.x);	
		
		//3 ведёт себя неправильно в многопоточной среде
		System.out.println("If you see the same message, then singleton was created (yaay!)");
		System.out.println("If you see different messages, then 2 objects were created (too bad)");
		Singleton3 s5 = Singleton3.getInstance3("Foo");
		Singleton3 s6 = Singleton3.getInstance3("Bar");
		System.out.println(s5.value +" "+ s6.value);
	}

}
