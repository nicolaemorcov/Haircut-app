package com.viewer.endpoints;

import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AuthEndpoint extends Endpoint{

	private static final long serialVersionUID = 4785042788453160450L;

	// Logger sor the requests...
	private static final Logger log = Logger
			.getLogger(AuthEndpoint.class.getName());
	
	@Override
	protected void service(HttpServletRequest request, 
			HttpServletResponse response) {
		
		String path = request.getRequestURI();
		log.info("Request " + path + " received on AuthEndpoint");

		
	}
	
}
