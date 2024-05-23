package Interfaces;

interface Workshop {
    public int x = 3;
    class Yurii{}
    public Yurii m = new Yurii();
    void method();
}

interface Outer {
    interface Nested1 {
        interface Nested2 {

        }
    }
}

interface C1{}
interface C2 extends C1{}
interface C3 extends C1{}
interface C4 extends C1{}

public class InterfaceWorkshop {
    interface Seyfal {}
    class V implements Seyfal{}
    public static void main(String[] args) {
        System.out.println(new InterfaceWorkshop().new V().toString());
        new Workshop(){
            @Override
            public void method() {
                System.out.println("Howdy!");
            }
        }.method();
    }
}
