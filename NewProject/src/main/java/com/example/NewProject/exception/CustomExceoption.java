package com.example.NewProject.exception;

public class CustomExceoption extends RuntimeException{

	public CustomExceoption() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CustomExceoption(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public CustomExceoption(String message, Throwable cause) {
		super(message,cause);
		// TODO Auto-generated constructor stub
	}
	
	public CustomExceoption(String message) {
		// TODO Auto-generated constructor stub
		super(message);
	}

	public CustomExceoption(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

}
