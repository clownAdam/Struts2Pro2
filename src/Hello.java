import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.dispatcher.HttpParameters;
import org.apache.struts2.dispatcher.Parameter;

import java.util.Arrays;
import java.util.Map;
import java.util.Set;

/**
 * @author Administrator
 */
public class Hello extends ActionSupport {
    public String hello(){
        System.out.println("通过请求");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++");
        ActionContext context = ActionContext.getContext();
        HttpParameters parameters = context.getParameters();
        //1
        String username = parameters.get("username").getValue();
        System.out.println(username);

        String nick = parameters.get("nick").getValue();
        System.out.println(nick);

        String[] hobbies = parameters.get("hobby").getMultipleValues();
        String hobby = Arrays.toString(hobbies);
        System.out.println(hobby);
        System.out.println("=============22=================");
        //2
        Set<Map.Entry<String, Parameter>> entries = parameters.entrySet();
        for (Map.Entry<String, Parameter> entry : entries) {
            System.out.println(entry.getKey());
            System.out.println(Arrays.toString(entry.getValue().getMultipleValues()));
        }
        //3
        context.put("username",username);
        context.getSession().put("nick",nick);
        context.getApplication().put("hobby",hobby);
        return SUCCESS;
    }
}
