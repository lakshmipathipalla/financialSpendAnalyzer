package com.financial.analyzer.exceptions;

public class CustomerIdRequiredException extends RuntimeException {

	/**
	 * Exception class for mandatory customer ID.
	 */
	private static final long serialVersionUID = 1L;

	public CustomerIdRequiredException() {
		super("Customer ID required");
	}
}
