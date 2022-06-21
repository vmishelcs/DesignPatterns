package main.java.observerpattern;

import java.util.List;

/**
 * Monitors the last entered digit by the user.
 * @author vmishel
 *
 */

public class Screen implements Observer {
	private Subject subject;
	private int digitsEntered;
	
	public Screen(Subject subject) {
		this.subject = subject;
		this.digitsEntered = 0;
	}
	
	@Override
	public void update() {
		if (subject instanceof KeyPad) {
			KeyPad keyPad = (KeyPad) subject;
			List<Integer> digits = keyPad.getDigits();
			// Check if a new digit has been entered.
			if (!digits.isEmpty() && digitsEntered != digits.size()) {
				digitsEntered = digits.size();
				int lastDigit = digits.get(digits.size() - 1);
				System.out.println("<Screen> Entered " + lastDigit + ".");
			}
		}
	}
}
