package Generics;

public class FirstGenericJlsRule {
    interface GenericInterface<P> {}
//    interface I1 extends GenericInterface<Integer> {}
    interface I2 extends GenericInterface<RuntimeException> {}
//    interface I3 extends I1, I2 {}
    class Experiment1<T> {

    }
//    class Experiment2 implements I3 {}

    public static void main(String[] args) {
        System.out.println(new FirstGenericJlsRule().new Experiment1<RuntimeException>());
        System.out.println(new FirstGenericJlsRule().new Experiment1<RuntimeException>());
    }
}
