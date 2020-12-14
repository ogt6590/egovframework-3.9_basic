package com.jeyun.test.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

//메소드 실행순서 filter -> preHandle -> controller -> postHandle -> afterCompletion 
public class AuthenticInterceptor extends HandlerInterceptorAdapter {
			 
	@Override
    public boolean preHandle(HttpServletRequest request,
    		HttpServletResponse response, Object handler) throws Exception {
        //여기부분에 세션체크나 권한체크 등 컨트롤러 동작전 확인하는 소스를 넣으면됨
		System.out.println("preHandle >>>  Controller 실행 전 실행");
        return true;
    }
 
    @Override
    public void postHandle(HttpServletRequest request, 
    		HttpServletResponse response, Object handler, ModelAndView modeAndView) throws Exception {
        System.out.println("postHandle >>>  Controller 실행 후 실행");
    }
 
    @Override
    public void afterCompletion(HttpServletRequest request, 
    		HttpServletResponse response, Object handler, Exception ex){
        System.out.println("afterCompletion >>>  preHandle 메소드 return값이 true일 때 실행");
    }
	   
}
