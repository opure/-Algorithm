package Thread;

public class Parcel6 {
        public Contents cont() {
                return new Contents() {
                 
                     
              };// 在这里需要一个分号
        }
 
        public static void main(String[] args) {
                Parcel6 p = new Parcel6();
                Contents c = p.cont();
                System.out.println();
                System.out.println(c.equals(new Object()));
                
        }
}