package adapter;
//additional info on links
//https://habr.com/ru/post/85095/
//https://refactoring.guru/ru/design-patterns/adapter/java/example#example-0
public class Demo {
	public static void main(String[] args) {
		RandomGeneratorAdapter adapter = new RandomGeneratorAdapter();
		SequenceGenerator generator = new SequenceGenerator(adapter);
		
		for (int i : generator.generate(10)) {
			System.out.print(i + " ");
		}
	}
}
