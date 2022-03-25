package assignments;

public class AsteriskLogger implements Logger {

	@Override
	public void log(String log) {
		System.out.println("***" + log + "***"); 
	}

	@Override
	public void error(String error) {
		int e = error.length();
		for (int i = 0; i < e + 13; i++) {
			System.out.print("*");
		}
		System.out.println("");
		System.out.println("***Error: " + error + "***");

		int x = error.length();
		for (int i = 0; i < x + 13; i++) {
			System.out.print("*");

		}

		System.out.println("");
	}
}
