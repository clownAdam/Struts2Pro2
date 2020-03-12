package com.itlike.myform;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;
import java.util.Map;

/**
 * @author Administrator
 */
public class MyFormAction2 extends ActionSupport {
    @Override
    public String execute(){
        //获取原生servlet api
        HttpServletRequest request = ServletActionContext.getRequest();
        String username = request.getParameter("username");
        String nick = request.getParameter("nick");
        String[] hobbies = request.getParameterValues("hobby");
        System.out.println("--------");
        Map<String, String[]> parameterMap = request.getParameterMap();
        for (Map.Entry<String, String[]> entry : parameterMap.entrySet()) {
            String key = entry.getKey();
            String[] value = entry.getValue();
            System.out.println(key);
            System.out.println("value = " + Arrays.toString(value));
        }
        System.out.println(username);
        System.out.println(nick);
        System.out.println(Arrays.toString(hobbies));
        request.setAttribute("username1",username);
        request.getSession().setAttribute("nick1",nick);
        ServletActionContext.getServletContext().setAttribute("hobby1",Arrays.toString(hobbies));
        return SUCCESS;
    }
}
