package Inheritance;

public class BaseClass4MethodOverride {
    class C1 {
        public Integer field = 1;
        public void f(Double p){
            System.out.println("C1");
        }
    }

    class C2 extends C1 {
        public Integer field = 2;

        //        @Override
        public void f(Float p) {
            System.out.println("C2");
        }
    }
    public static void main(String[] args) {
        new BaseClass4MethodOverride().new C2().f(3.14);
        new BaseClass4MethodOverride().new C2().f(3.14);
    }
}
