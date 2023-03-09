package com.example.demo1;

import java.io.IOException;
import java.io.PrintWriter;

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
@Order(1)
public class RequestLoggingFilter implements Filter {
    private static final Logger logger = LoggerFactory.getLogger(RequestLoggingFilter.class);
    
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		System.out.println("In RequestLoggingFilter  comming..");
		request.setAttribute("test", "yktykt");
//		if( true ) {
//			PrintWriter out = response.getWriter();
//			out.print("test 입니다.");
//		}else {
			chain.doFilter(request, response);
		//}
		System.out.println("Out RequestLoggingFilter  comming..");
	}

}
