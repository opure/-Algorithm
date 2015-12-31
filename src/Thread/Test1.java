package Thread;

public class Test1 extends Thread{
    private String name;
    public Test1(String name ){
        this.name=name;
    }

public void  run(){
       for(int i=0 ;i<Integer.MAX_VALUE;i++) {
           System.out.println(name+""+i);
       } 
   }
public static void main(String[] args) {
    Test1 test1 = new Test1("zz");
    Test1 test12 = new Test1("er");
    Test1 test14 = new Test1("zz");
    Test1 test13 = new Test1("er");
    test1.start();
    test12.start();
    test13.start();
    test14.start();
    
}
}
