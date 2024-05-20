package OOP;

public class MoreScopes {
//    static {
//        VALUE = 10;
//    }
    public MoreScopes(int x) {
        VALUE = x;
    }
//    static {
//        VALUE = 30;
//        { VALUE = 1;}
//    }
    public static int VALUE = 15;

    public static void main(String[] args) {
        new MoreScopes(5);
        System.out.println(MoreScopes.VALUE);
    }
}
