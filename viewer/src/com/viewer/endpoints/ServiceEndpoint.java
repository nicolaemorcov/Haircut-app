package com.viewer.endpoints;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.viewer.handlers.Handler;
import com.viewer.handlers.InfoHandler;
import com.viewer.handlers.UserAuthenticationHandler;

public class ServiceEndpoint extends Endpoint {

	private static final long serialVersionUID = 7959912518978202195L;
	
	// Logger sor the requests...
	private static final Logger log = Logger.getLogger(ServiceEndpoint.class.getName());

	@Override
	public void init(ServletConfig config) throws ServletException {
		initializeMappings();
	}
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) {

		String path = request.getRequestURI();
		log.info("Request " + path + " received on RootEndpoint");
		
		response.setContentType("application/json;charset=UTF-8");
		response.setStatus(200);
		try {
			response.getWriter().write("{name: test}");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		//this will hold the path params
//		List<String> pathArgs = new ArrayList<String>();
//		
//		Handler handler = findHandler(path, pathArgs);
//		

	}
	
	// associate right Handler with request type, 
	// if request url is localhost:8080/info/.... then call InfoHandler,
	// if request url is localhost:8080/auth/.... then call UserAuthenticationHandler,
	private void initializeMappings() {
		log.info("adding the handlers");
		
		// the url localhost:8080/info/...
		addHandler(InfoHandler.class, "(?i)^/info/.*");
		
		// the url localhost:8080/auth/...
		addHandler(UserAuthenticationHandler.class, "(?i)^/auth/.*");
	}

}
