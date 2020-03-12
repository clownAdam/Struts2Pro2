package com.itlike.ognl;

import com.itlike.myform.com.itlike.dome.Goods;
import ognl.Ognl;
import ognl.OgnlContext;
import ognl.OgnlException;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Administrator
 */
public class OgnlTest {
    private static OgnlContext ognlContext;
    @Before
    public void before(){
        ognlContext = new OgnlContext();
    }
    @Test
    public void test(){
        //ognl的使用
        OgnlContext ognlContext = new OgnlContext();
        ognlContext.setRoot("aaa");
        Object root1 = Ognl.getRoot(ognlContext);

        Object root = ognlContext.getRoot();
        System.out.println(root);
        System.out.println(root1);
    }
    @Test
    public void test2() throws OgnlException {
        //跟对象
        Goods goods = new Goods();
        goods.setName("itlike");
        goods.setPrice(888.0);
        ognlContext.setRoot(goods);
        System.out.println(ognlContext.getRoot());
        Object root = Ognl.getRoot(ognlContext);
        System.out.println(root);
        System.out.println(Ognl.getValue("name", ognlContext,ognlContext.getRoot()));
        System.out.println(Ognl.getValue("price", ognlContext,ognlContext.getRoot()));
    }
    @Test
    public void test3() throws OgnlException {
        Goods goods = new Goods();
        goods.setName("itlike2");
        goods.setPrice(888.0);
        //非根对象 非根对象是不能取字段
        ognlContext.put("goods", goods);
        Goods goods1 = (Goods) Ognl.getValue("#goods", ognlContext, ognlContext.getRoot());
        System.out.println(goods1.getName());
        System.out.println(goods1.getPrice());
    }
    @Test
    public void test4() throws OgnlException {
        OgnlContext ognlContext = new OgnlContext();
        Object root = ognlContext.getRoot();
//        调用对象的普通方法
        Object value = Ognl.getValue("'hello'.length", ognlContext, root);
        System.out.println(value);
//静态方法
        System.out.println(Ognl.getValue("@java.lang.Math@random()", ognlContext, root));
    }
}
