package bridge;

public class Windows implements Bridge{

	@Override
	public void launchWiFi() {
		System.out.println("Launching Wi-Fi on Windows");
	}

	@Override
	public void launchBrowser() {
		System.out.println("Launching Browser on Windows");
	}

}
