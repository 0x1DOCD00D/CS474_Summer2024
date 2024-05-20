package OOP;

public class InnerNestedClasses {
    class C1 {
        static class C2 {
            static class C3 {
                class C4 {
                    class C5 {
                        static class C6 {
                            public int property = 0;
                        }
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
//        new InnerNestedClasses.C1.C2.C3.C5.C6();
//        new InnerNestedClasses.C1.C2.C3().new C4().new C5();
//        new InnerNestedClasses.C1.C2.C3.C4.C5.C6();
//        new InnerNestedClasses.C1.C2.C3();
    }
}
