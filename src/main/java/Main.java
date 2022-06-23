public class Main {
    static boolean isTrue = true;
    static boolean isFalse = false;
    public static void main(String[] args) {
        System.out.println("Truth table for && operator");
        System.out.println("true && true = " + (isTrue && isTrue));
        System.out.println("true && false = " + (isTrue && isFalse));
        System.out.println("false && false = " + (isFalse && isFalse));
        System.out.println("false && true = " + (isFalse && isTrue));
    }
}
