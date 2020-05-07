package prototype;
//https://refactoring.guru/ru/design-patterns/prototype - ���������� � ����������

public class Prototype {
	private int x;
	private int y;
	
	public Prototype(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return this.x;
	}
	
	public int getY() {
		return this.y;
	}
	
	public String toString() {
		return x + ";" + y;
	}
	//��� ����� �����
	public Prototype clone() {
		return new Prototype(x, y);
	}
}
