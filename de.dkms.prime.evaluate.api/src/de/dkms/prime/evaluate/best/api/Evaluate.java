package de.dkms.prime.evaluate.best.api;

/**
 * A service that evaluates an expression and returns the result
 */
public interface Evaluate {
	
	/**
	 * Evaluate an expression and return the result
	 */
	double evaluate(String expression) throws Exception;
	
}
