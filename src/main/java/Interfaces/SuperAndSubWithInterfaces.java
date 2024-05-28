package Interfaces;

public class SuperAndSubWithInterfaces {
    interface Superinterface {
        default void foo() { System.out.println("Hi"); }
    }

    class Subclass2 implements Superinterface {
        public void foo() {
            tweak();
//            throw new UnsupportedOperationException();
        }

        void tweak() {
            Superinterface.super.foo();  // Gets the 'println' behavior
        }
    }

    public static void main(String[] args) {
        SuperAndSubWithInterfaces.Superinterface obj = new SuperAndSubWithInterfaces().new Subclass2();
        obj.foo();
    }
}
