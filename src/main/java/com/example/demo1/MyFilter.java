package com.example.demo1;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(2)
public class MyFilter implements Filter {
	@Override
	  public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException { 
	    // 요청 처리 전 코드 작성
	    System.out.println("Before the request is processed by the controller");
	    System.out.println("request : " + request.getAttribute("test"));
	    
	    chain.doFilter(request, response);
	    
	    // 응답 처리 후 코드 작성
	    System.out.println("After the response is returned by the controller");
	  }
}
