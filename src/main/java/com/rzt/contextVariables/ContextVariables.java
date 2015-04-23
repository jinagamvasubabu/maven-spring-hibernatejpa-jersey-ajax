
package com.rzt.contextVariables;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;


public class ContextVariables {
	
	@Context
	private UriInfo uriInfo;
	@Context
	private HttpServletRequest serRequest;
	@Context
	private HttpServletResponse serResponse;

	@Context
	private ServletContext context;

	public UriInfo getUriInfo() {
		return uriInfo;
	}

	public void setUriInfo(UriInfo uriInfo) {
		this.uriInfo = uriInfo;
	}

	public HttpServletRequest getSerRequest() {
		return serRequest;
	}

	public void setSerRequest(HttpServletRequest serRequest) {
		this.serRequest = serRequest;
	}

	public HttpServletResponse getSerResponse() {
		return serResponse;
	}

	public void setSerResponse(HttpServletResponse serResponse) {
		this.serResponse = serResponse;
	}

	public ServletContext getContext() {
		return context;
	}

	public void setContext(ServletContext context) {
		this.context = context;
	}

}
