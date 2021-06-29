package com.lms.kh.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AccessLogFilter implements Filter{
	
	private final Logger log = LoggerFactory.getLogger(AccessLogFilter.class);

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		log.info("★★★★★AccessLogFilter 필터 시작★★★★★");
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		HttpServletRequest req = (HttpServletRequest)request;
		
		String remoteURL = req.getRequestURL().toString();
		String queryString = req.getQueryString();
		
		String fullURL = remoteURL + "?" + queryString;
		log.info(fullURL);
		
		chain.doFilter(request, response);
	}

	@Override
	public void destroy() {
		log.info("♠♠♠♠♠AccessLogFilter 필터 종료♠♠♠♠♠");
	}
	
	
}
