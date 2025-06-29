package com.practise.exceptions;

public class InvalidBrowserNameException extends RuntimeException {

	private String browserName;

	public InvalidBrowserNameException(String browserName) {

		this.browserName = browserName;
	}

	@Override
	public String toString() {

		return "invalid browser name:" + browserName;
	}

}
