package dynaicproxy.cglib;

import net.sf.cglib.proxy.Callback;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.NoOp;

public class UserDao {
    public void create() {
        System.out.println("创建");
    }
    public void delte(){
        System.out.println("删除");
    }
    public void update(){
        System.out.println("更新");
    }
    public static UserDao getProxyInstance(MyProxy myProxy){  
        Enhancer en = new Enhancer();   
        en.setCallbacks(new Callback[]{myProxy,NoOp.INSTANCE}) ;
        en.setCallbackFilter(new callbackFilter());
       //进行代理   
        en.setSuperclass(UserDao.class);   
       // en.setCallback(myProxy);  
        //生成代理实例   
        return (UserDao)en.create();   
  }
}
