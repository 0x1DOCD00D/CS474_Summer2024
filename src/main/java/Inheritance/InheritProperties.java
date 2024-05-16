package Inheritance;

public class InheritProperties {

    class Parent{
        public Integer prop1 = 1;
        public void behavior(){
            System.out.println("Parent.behavior");
        }
    }

    class Child extends Parent{
        public Integer prop2 = 2;
        public Float gpa = 4.0f;
        public void behavior(){
            System.out.println("Child.behavior");
        }
    }
    public static void main(String[] args) {
//        System.out.println(new InheritProperties().new Child().prop1.toString());
//        System.out.println(new InheritProperties().new Parent().prop1.toString());

        InheritProperties.Parent par = new InheritProperties().new Child();
        par.behavior();
//        System.out.println(par.gpa.toString());

    }
}
