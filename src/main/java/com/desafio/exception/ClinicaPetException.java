package com.desafio.exception;

public class ClinicaPetException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4739707901022927576L;
	
	private String message;

	public ClinicaPetException(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	

}
