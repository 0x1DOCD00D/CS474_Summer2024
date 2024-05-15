package OOP;

public class City {
    public int creditScore = 500;
    public abstract class Person {
        public int creditScore = 300;
        enum EMPLOYMENT {
            EMPLOYED, JOBLESS {
                public int creditScore = 100;
                void g() {
                    System.out.println("EMPLOYMENT.g");
                }
            }, PARTTIME {
                void f() {
                    System.out.println("EMPLOYMENT.f");
                }
            }
        }

        EMPLOYMENT lof = EMPLOYMENT.JOBLESS;//level of emp

        abstract float production();

        public Person(EMPLOYMENT e) {
            lof = e;
        }

        public Person() {
            lof = EMPLOYMENT.JOBLESS;
        }
    }

    class OfficeWorker extends Person {
        @Override
        float production() {
            return lof.ordinal();
        }

        public OfficeWorker(EMPLOYMENT e) {
            super(e);
        }

        public OfficeWorker() {
            super();
        }
    }

    class Homeless extends Person {
        @Override
        float production() {
            return 2.0f;
        }
    }
}




