package dynaicproxy.cglib;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.CallbackFilter;

public class callbackFilter implements CallbackFilter {

    @Override
    public int accept(Method arg0) {
        // TODO Auto-generated method stub
        if (!"update".equalsIgnoreCase(arg0.getName())) {
            return 0;
        }
        return 1;
    }

}
