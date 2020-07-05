package com.qsd.messageboard.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

/**
 * @Description 
 * @Author Esion
 * @Data 2020年7月5日
 */
@Component
public class LoginInterceptor implements HandlerInterceptor {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		Object object = request.getSession().getAttribute("user");
		if (object != null) {
			return true;
		}else {
			response.sendRedirect("/login.html");
			return false;
		}
	}
	
}
