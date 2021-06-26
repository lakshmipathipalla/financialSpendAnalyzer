package com.financial.analyzer.exceptions;

public class InvalidInputException extends RuntimeException {

	/**
	 * Exception class for invalid customer ID.
	 */
	private static final long serialVersionUID = 1L;
	
	public InvalidInputException() {
		super("Invalid customer ID");
	}

}
