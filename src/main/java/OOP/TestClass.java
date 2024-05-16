package OOP;

public class TestClass {
    int y = 1;
    public TestClass(){  y = 2;  f();  }
    void f () {
        System.out.println("Value = " + String.valueOf(y));
    }
    public static class B extends TestClass {
        int y = 3;
        public B(){ f(); }
        void f () {
            System.out.println("Value = " + String.valueOf(y));
        }
    }
    public static void main(String[] args) {
        TestClass o = new TestClass.B ();
    }}

