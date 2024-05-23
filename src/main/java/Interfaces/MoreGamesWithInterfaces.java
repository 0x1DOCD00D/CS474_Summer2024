package Interfaces;

public class MoreGamesWithInterfaces {
    public int field = 3;
    interface I1 {
        void m();
    }

    interface I2 {
        public int field1 = 3;
        void m();
    }
    interface I3 {
//        public int field1 = 3;
        void m(int p);
    }

    class C implements I1, I2, I3 {
        @Override
        public void m() {
            int x = field1;
        }

        @Override
        public void m(int p) {

        }
    }
    public static void main(String[] args) {
        MoreGamesWithInterfaces.I1 o1 = new MoreGamesWithInterfaces().new C();
        MoreGamesWithInterfaces.I2 o2 = new MoreGamesWithInterfaces().new C();
        new I1() {
            @Override
            public void m() {

            }
        };
    }
}
