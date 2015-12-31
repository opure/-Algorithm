package dynaicproxy.cglib;

public class Client {
    public static void main(String[] args) {
        
      UserDao.getProxyInstance(new MyProxy("张三d")).create();
      UserDao.getProxyInstance(new MyProxy("张三d")).update();
    }
}
