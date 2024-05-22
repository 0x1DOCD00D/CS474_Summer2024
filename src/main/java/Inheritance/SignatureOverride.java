package Inheritance;

public class SignatureOverride {
    class A{
        public void f() {
            System.out.println("A");
        }
    }

    class B extends A {
        @Override
        public void f() {
            System.out.println("B");
        }
        public void h() {
            System.out.println("B::h");
        }
    }
    public static void main(String[] args) {
        SignatureOverride outer = new SignatureOverride();
        SignatureOverride.A o1 = outer.new B();
        o1.f();
    }
}
