package com.viewer.handlers;

public class ResponseHandler {
	
	protected int statusCode;
	protected String contentType;
	
	public ResponseHandler() {
		statusCode = 200;
		contentType = "text/plain";
	}
	
	public ResponseHandler setStatusCode(int statusCode) {
		this.statusCode = statusCode;
		
		return this;
	}
	
	public ResponseHandler setContentType(String contentType) {
		this.contentType = contentType;
		return this;
	}
}
