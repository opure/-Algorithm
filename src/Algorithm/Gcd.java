package Algorithm;

public class Gcd {
    private int result = 1;
    private int getMax(int a, int b) {
        if (a%b == 0) {
            return b;
        } else {
            return getMax(b,  a% b);
        }
   }
    public int maincode(int a, int b) {
        if (a> b) {
            result = getMax(a, b);
        } else {
            result = getMax(b, a);
        }
        System.out.println(result);
        return 0;
        
    }
    public static void main(String[] args) {
        Gcd gcd = new Gcd();
        gcd.maincode(15, 12);
        }
}