package bridge;

public class Linux implements Bridge{

	@Override
	public void launchWiFi() {
		System.out.println("Launching Wi-Fi on Linux");
	}

	@Override
	public void launchBrowser() {
		System.out.println("Launching Browser on Linux");
	}

}
