package assignments;

public class App { // for defining asteriskLogger and spacedLogger class

	public static void main(String[] args) {


		AsteriskLogger asterisk = new AsteriskLogger(); //this is an instance
		asterisk.log("Goodbye");

		AsteriskLogger asteriskBox = new AsteriskLogger();
		asterisk.error("Happy");

		SpacedLogger space = new SpacedLogger();
		space.log("Hello");

		SpacedLogger errorSpace = new SpacedLogger();
		space.error("Choice");

	}

}
