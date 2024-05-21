package OOP;

public class TestClass {
    int y = 1;
    static int z = 3;
    public TestClass(){
        System.out.println("Testclass this: " + this.toString());
        y = 2;  this.f();  }
    static {
        z = 4;
    }
    void f () {
        System.out.println("Value = " + String.valueOf(y));
    }
    public static class B extends TestClass {
        int y = 3;
        public B(){
            System.out.println("B this: " + this.toString());
            f();
        }
        void f () {
            super.f();
//            System.out.println("Value = " + String.valueOf(y));
        }
    }
    static{
        z = 5;
    }
    public static void main(String[] args) {
        TestClass o = new TestClass.B ();
        System.out.println(o.y);
    }}

