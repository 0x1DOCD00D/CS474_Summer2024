package Inheritance;

public class UpcastDowncast {
    class C1 {}
    class C2 extends C1 {}
    class C3 extends C1 {}
    class C4 extends C3 {}
    class C5 extends C4 {
        public void f(){}
    }

    public static void main(String[] args) {
        UpcastDowncast outer = new UpcastDowncast();
        UpcastDowncast.C1 o = outer.new C5();
        ((C5)o).f();
    }
}
