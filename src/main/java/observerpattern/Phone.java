package main.java.observerpattern;

/**
 * The Phone class holds references to a KeyPad object, and a Screen object.
 * The Screen object monitors what the user enters into the KeyPad, and
 * prints the results to the console.
 * @author vmishel
 * 
 */

public class Phone {
	private final KeyPad keyPad = new KeyPad();
	private final Screen screen = new Screen(keyPad);
	private final NetworkProvider networkProvider = new NetworkProvider(keyPad);
	
	public Phone() {
		// Register observers.
		keyPad.registerObserver(screen);
		keyPad.registerObserver(networkProvider);
	}

	public void call(String number) {
		for (int i = 0; i < number.length(); ++i) {
			keyPad.enterDigit(Character.getNumericValue(number.charAt(i)));
		}
		keyPad.pressCall();
	}
	
	public void endCall() {
		keyPad.pressEndCall();
	}

}
