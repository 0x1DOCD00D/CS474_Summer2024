package Generics;

public class MyStorageForSomething<IcanUseAnythingHere, DylanWantsAnotherGenerricTypeVar> {
    public IcanUseAnythingHere getSt1() {
        return st1;
    }

    public DylanWantsAnotherGenerricTypeVar getSt2() {
        return st2;
    }

    public MyStorageForSomething(IcanUseAnythingHere st1, DylanWantsAnotherGenerricTypeVar st2) {
        this.st1 = st1;
        this.st2 = st2;
    }

    public long complexBehavior() {
        return st1.hashCode()+st2.hashCode();
    }

    private IcanUseAnythingHere st1;
    private DylanWantsAnotherGenerricTypeVar st2;

    public static void main(String[] args) {
        class Student {}

        MyStorageForSomething complexStorage = new MyStorageForSomething<Student,Float>(
                new Student(),
                3.2f
        );
        System.out.println(complexStorage.getSt2());
        System.out.println(complexStorage.complexBehavior());

    }
}
