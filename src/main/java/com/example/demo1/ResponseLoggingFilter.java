
package com.example.demo1;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(3)
public class ResponseLoggingFilter implements Filter {
	 private static final Logger logger = LoggerFactory.getLogger(ResponseLoggingFilter.class);
	 
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		System.out.println("In ResponseLoggingFilter  comming... ");
		
		chain.doFilter(request, response);
		System.out.println("out ResponseLoggingFilter  comming... ");
	}

}
