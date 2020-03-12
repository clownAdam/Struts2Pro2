package com.itlike.myform;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.util.ServletContextAware;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

/**
 * @author Administrator
 */
public class Demo implements ServletRequestAware,ServletContextAware {
    private HttpServletRequest httpServletRequest;
    private ServletContext servletContext;

    public String execute(){
        String username = httpServletRequest.getParameter("username");
        httpServletRequest.setAttribute("username2",username);
        return "login";
    }

    @Override
    public void setServletRequest(HttpServletRequest httpServletRequest) {
        this.httpServletRequest = httpServletRequest;
    }

    @Override
    public void setServletContext(ServletContext servletContext) {
        this.servletContext = servletContext;
    }
}
