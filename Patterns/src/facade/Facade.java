package facade;

public class Facade {
	public static double kztToCAD (double kzt) {
		
		MyURL url = new MyURL();
		url.href = "http://kurs.kz";
		Request r = new Request (url);
		String result = r.sendRequest();
		Parser p = new Parser();
		double ratio = p.getRatioCurrency(result);
		return ((double) Math.round(kzt *100/ratio)/100);
	}
}
