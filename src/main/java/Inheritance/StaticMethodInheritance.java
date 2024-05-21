package Inheritance;

public class StaticMethodInheritance {
    public static void m(){
        System.out.println("StaticMethodInheritance");
    }

    class CC1 extends StaticMethodInheritance{
//        @Override
        public static void m(){
            System.out.println("C1");
        }
    }

    class CC2 extends CC1{
//        @Override
        public static void m(){
            System.out.println("C2");
        }
    }

    public static void main(String[] args) {
//        StaticMethodInheritance.CC2.m();
        StaticMethodInheritance om = new StaticMethodInheritance().new CC2();
        om.m();
    }
}
