package prototype;
 
public class Demo {
	
	public static void main(String[] args) {
		
	Prototype p1 = new Prototype(5, 10);
	System.out.println(p1);
	
	Prototype p2 = p1.clone();
	System.out.println(p2);

}
}
