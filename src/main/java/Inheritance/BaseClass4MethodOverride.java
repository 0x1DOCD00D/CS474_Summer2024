package Inheritance;

public class BaseClass4MethodOverride {
//    BaseClass4MethodOverride myThis = this;
    class C1 {
        public Integer field = 1;
        public void f(Double p){
            System.out.println("C1");
        }
    }

    class C2 extends C1 {
        public Integer field = 2;

        @Override
        public void f(Double p) {
            System.out.println("C2");
        }
    }

    class C3 extends C2{
//        C2 mySuper = super;
        @Override
        public void f(Double p) {
            super.f(p);
//            super.super.f(p);
        }
    }
    public static void main(String[] args) {
        BaseClass4MethodOverride.C2 om = new BaseClass4MethodOverride().new C2();
        System.out.println(om.field);
//        BaseClass4MethodOverride.C1 om = new BaseClass4MethodOverride().new C3();
//        om.f(3.14);
//        BaseClass4MethodOverride.C1 om = new BaseClass4MethodOverride().new C2();
//        om.f(3.14);
//        BaseClass4MethodOverride.C1 o = new BaseClass4MethodOverride().new C2();
//        System.out.println(o.field);
    }
}
