package main.test.java;

import java.util.Random;

import main.java.observerpattern.Phone;

public class ObserverPatternTest {
	public static void main(String args[]) {
		// Create a phone.
		Phone phone = new Phone();
		
		// Enter random digits into the phone.
		Random rand = new Random();
		int maxKeyPadDigit = 10;
		int phoneNumberLength = 10;
		String number = "";
		for (int i = 0; i < phoneNumberLength; ++i) {
			number += Integer.toString(rand.nextInt(maxKeyPadDigit));
		}
		
		// Call the number.
		phone.call(number);
		phone.endCall();
	}
}
