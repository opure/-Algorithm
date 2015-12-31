package dynaicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class HelloWorldHandel implements InvocationHandler {
    private Object object;
    
    /*private Object bind(Object object) {
        this.object = object;
        return Proxy.newProxyInstance(object.getClass().getClassLoader(), object.getClass().getInterfaces(), this);
    }
*/
     public HelloWorldHandel(Object object) {
        // TODO Auto-generated constructor stub
         this.object = object;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // TODO Auto-generated method stub
        Object result ;
        System.out.println("kaihsi");
        result = method.invoke(object, args);
        System.out.println("jiesu");
        return result;
        }
    public static void main(String[] args) {
        /*HelloWorldHandel handel = new HelloWorldHandel();
        HelloWorld helloWorld = (HelloWorld) handel.bind(new HelloImpl());
        helloWorld.sayHello();*/
        HelloWorld helloWorld = new HelloImpl();
        HelloWorldHandel handel = new HelloWorldHandel(helloWorld);
        HelloWorld helloWorld2 = (HelloWorld) Proxy.newProxyInstance(helloWorld.getClass().getClassLoader(), helloWorld.getClass().getInterfaces(), handel);
        helloWorld2.sayHello();
        }
}
