package Inheritance;

public class InheritProperties {

    class Parent{
        public Integer prop = 1;
    }

    class Child extends Parent{
        public Integer prop = 2;
        public Float gpa = 4.0f;
    }
    public static void main(String[] args) {
        System.out.println(new InheritProperties().new Child().prop.toString());
        System.out.println(new InheritProperties().new Parent().prop.toString());

        InheritProperties.Parent par = new InheritProperties().new Child();
        System.out.println(par.prop.toString());
//        System.out.println(par.gpa.toString());

    }
}
