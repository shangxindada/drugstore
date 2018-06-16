package com.shangxin.interceptors;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.shangxin.bean.User;

public class LoginInterceptor implements HandlerInterceptor{


	@Override
	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object hander) throws Exception {
		User loginUser=(User)request.getSession().getAttribute("currentUser");
		StringBuffer requestURL = request.getRequestURL();
		String fromUrl=requestURL.toString();
		if(fromUrl.contains("login")){
			return true;
		}
		else if(fromUrl.contains("register")){
			return true;
		}
		else if(loginUser!=null){
			return true;
		}else{
			response.sendRedirect("login.jsp");
			return false;
		}
	}

}
