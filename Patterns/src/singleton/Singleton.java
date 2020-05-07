package singleton;
/*������ 
 * https://habr.com/ru/post/27108/ - ���������� ������ ��������
 * https://refactoring.guru/ru/design-patterns/singleton/java/example#example-2 - ������������� �������
 * */


//1 - �� �������� ��� ���������������
public class Singleton {
	public int x;
	private static Singleton object;
	
	private Singleton() {
		this.x = 10;
	}
	
	public static Singleton getSingleton() {
		if(object == null) object = new Singleton();
		return object;
	}
}
//2 ������� ���� ���
 class Singleton2 {
	public int x;
	private static Singleton2 object;
	
	private Singleton2() {
		this.x = 10;
	}
	//������������� ����������� ������, ������� ���� ���(Bill Pugh ��� ��������������� � ������� �������������
	private static class SingletonHolder{
		private final static Singleton2 object = new Singleton2();
	}
	public static Singleton2 getSingleton2() {

		return SingletonHolder.object;
	}
}
 
 //3
 final class Singleton3 {
	 private static Singleton3 instance;
	 public String value;
	 
	 private Singleton3 (String value) {
		 try {
			 Thread.sleep(1000);
		 } catch (InterruptedException ex) {
			 ex.printStackTrace(); 
		 } this.value = value;
	 }
	 
	 public static Singleton3 getInstance3 (String value) {
		 if (instance == null) {
			 instance = new Singleton3(value);
		 }
		 return instance;
	 }
 }