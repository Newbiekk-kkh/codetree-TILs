public class Main {
    public static void main(String[] args) {
        int a = 5 , b = 6 , c = 7 ;
        
        int tempNum1 = b;
        int tempNum2 = c;

        b = a;
        c = tempNum1;
        a = tempNum2;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}