package Algorithm;

import java.util.HashMap;
import java.util.Map;

public class Maptest {
    
    public static void main(String[] args) {
        Map<Integer, Object> param = new HashMap<Integer, Object>();
        param.put(1, null);
        param.put(2, "nihao");
        for (Integer key : param.keySet()) {
            System.out.println(key);
            System.out.println(param.get(key));
            
        }
    }

}
