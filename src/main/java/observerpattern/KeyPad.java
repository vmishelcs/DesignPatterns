package main.java.observerpattern;

import java.util.ArrayList;
import java.util.List;

public class KeyPad implements Subject {
	private List<Integer> digits = new ArrayList<Integer>();
	private List<Observer> observers = new ArrayList<Observer>();
	boolean calling = false;
	
	public KeyPad() {
		// Do nothing.
	}
	
	/**
	 * Represents the user entering digits on their key pad.
	 * @param digit: the digit that the user pressed on the key pad.
	 */
	public void enterDigit(int digit) {
		digits.add(digit);
		notifyObservers();
	}
	
	/**
	 * Represents the user pressing the call button.
	 */
	public void pressCall() {
		calling = true;
		notifyObservers();
		digits.clear();
	}
	
	/**
	 * Represents the user pressing the end-call button.
	 */
	public void pressEndCall() {
		calling = false;
		notifyObservers();
	}
	
	public List<Integer> getDigits() {
		return digits;
	}
	
	public boolean isCalling() {
		return calling;
	}

	@Override
	public void registerObserver(Observer o) {
		observers.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		observers.remove(o);
	}

	@Override
	public void notifyObservers() {
		for (Observer o : observers) {
			o.update();
		}
	}
}
