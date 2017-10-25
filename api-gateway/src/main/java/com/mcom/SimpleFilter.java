package com.mcom;



import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

public class SimpleFilter extends ZuulFilter{
	
	private static Logger logger=LoggerFactory.getLogger(SimpleFilter.class);
	

	@Override
	public Object run() {
		RequestContext ctx = RequestContext.getCurrentContext();
		HttpServletRequest req = ctx.getRequest();
		
		logger.info(req.getMethod() + " - " + req.getRequestURI());
		
		return null;
	}

	@Override
	public boolean shouldFilter() {
		return true;
	}

	@Override
	public int filterOrder() {
		return 1;
	}

	@Override
	public String filterType() {
		return "pre";
	}

}
