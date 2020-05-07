package bridge;
//https://refactoring.guru/ru/design-patterns/bridge

public class Demo {

	public static void main(String[] args) {
		boolean isWindows = false;
		
		Bridge b;
		if (isWindows) b = new Windows();
		else b = new Linux();
		
		b.launchWiFi();
		b.launchBrowser();
	}

}
