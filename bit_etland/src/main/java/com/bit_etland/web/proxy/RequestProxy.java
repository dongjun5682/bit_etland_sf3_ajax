package com.bit_etland.web.proxy;

import javax.servlet.http.HttpServletRequest;


public class RequestProxy implements Proxy{
	private HttpServletRequest request;
	@Override
	public void carryOut(Object o) {
		System.out.println("----------3------------");
			setRequest((HttpServletRequest) o);
	}
	public HttpServletRequest getRequest() {
		return request;
	}
	public void setRequest(HttpServletRequest request) {
		this.request = request;
	}
	

}
