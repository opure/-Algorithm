package dynaicproxy.cglib;

import java.lang.reflect.Method;
import java.util.logging.Logger;

import org.lxh.demo15.classinfodemo.GetConstructorDemo01;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class MyProxy implements MethodInterceptor {
    private String name;
    private Enhancer en = new Enhancer();
    public MyProxy(String name) {
        this.name=name;
    }
    public Object getDao(Class<?> clz) {
        en.setSuperclass(clz);
        en.setCallback(this);
        return en.create();
        
    } 
    @Override
    public Object intercept(Object arg0, Method arg1, Object[] arg2, MethodProxy arg3) throws Throwable {
        System.out.println("方法名字"+arg1.getName());
        if(!"张三".equals(name)){   
            System.out.println("你没有权限！");   
            return null;   
           }   
           Object result = arg3 .invokeSuper(arg0, arg2);  
             
           return result;
    }

}
