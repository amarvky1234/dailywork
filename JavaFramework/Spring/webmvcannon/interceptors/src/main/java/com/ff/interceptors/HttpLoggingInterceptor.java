package com.ff.interceptors;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDateTime;
import java.util.logging.Logger;

@Component
public class HttpLoggingInterceptor implements HandlerInterceptor {
    final private static Logger logger = Logger.getLogger(HttpLoggingInterceptor.class.getName());

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        logger.info("received inbound request: " + request.getMethod() + " URL: " + request.getRequestURL() + " at : " + LocalDateTime.now());
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        logger.info("completed request: " + request.getRequestURL());
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        logger.info("finished processing the request and dispatching the response : " + request.getRequestURL() + " with status code : " + response.getStatus() + " at : " + LocalDateTime.now());
    }
}
