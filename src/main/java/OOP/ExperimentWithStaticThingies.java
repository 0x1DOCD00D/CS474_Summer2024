package OOP;

public class ExperimentWithStaticThingies {
    private static int field = 10;
    public  int nonStaticfield = 10;
    {
        System.out.println("In the inner scope: " + String.valueOf(field));
        System.out.println("In the inner scope not static: " + String.valueOf(nonStaticfield));
        field = 20;
        nonStaticfield = 50;
    }

    static void f() {
        field = 70;
    }

    void g(){}
    class Natalia {
        void g(){}
    }

    class A {
         class B {
            static class C {
                class D {
                    static class E {
                        class F {
                               public int ff = 100;
                        }
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        ExperimentWithStaticThingies.A.B.C.D.E.F iOfF = new ExperimentWithStaticThingies.A.B.C.D.E().new F();
        ExperimentWithStaticThingies.A.B.C.D.E iOfE = new ExperimentWithStaticThingies.A.B.C.D.E();
        ExperimentWithStaticThingies.A.B.C.D iOfD = new ExperimentWithStaticThingies.A.B.C().new D();
        ExperimentWithStaticThingies.A.B.C iOfC = new ExperimentWithStaticThingies.A.B.C();
        ExperimentWithStaticThingies.A.B iOfB = new ExperimentWithStaticThingies().new A().new B();
        ExperimentWithStaticThingies.A iOfA = new ExperimentWithStaticThingies().new A();
        System.out.println(iOfF.toString());
        System.out.println(iOfE.toString());
        System.out.println(iOfD.toString());
        System.out.println(iOfC.toString());
        System.out.println(iOfB.toString());

        ExperimentWithStaticThingies i1 = new ExperimentWithStaticThingies();
        ExperimentWithStaticThingies i2 = new ExperimentWithStaticThingies();
        ExperimentWithStaticThingies i3 = new ExperimentWithStaticThingies();
        ExperimentWithStaticThingies.f();
        System.out.println(i1.field);
        System.out.println(i2.field);
        System.out.println(i3.field);
    }
}
