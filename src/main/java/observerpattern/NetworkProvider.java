package main.java.observerpattern;

import java.util.List;

/**
 * NetworkProvider wants to know when we attempt to make a call using
 * our phone's key pad.
 * @author vmishel
 * 
 */

public class NetworkProvider implements Observer {
	private Subject subject;
	private boolean calling = false;
	
	public NetworkProvider(Subject subject) {
		this.subject = subject;
	}
	
	@Override
	public void update() {
		if (subject instanceof KeyPad) {
			KeyPad keyPad = (KeyPad) subject;
			
			// Check if calling.
			if (keyPad.isCalling() && !calling) {
				calling = true;
				System.out.printf("<NetworkProvider> Calling ");
				List<Integer> digits = keyPad.getDigits();
				for (int digit : digits) {
					System.out.printf("%d", digit);
				}
				System.out.printf(".\n");
			}
			
			// Check if ending call.
			if (!keyPad.isCalling() && calling) {
				System.out.println("<NetworkProvider> Call ended.");
			}
		}
	}
	
}
