package Generics;

public class IntersectionTypes {
    interface Human {
        void steal();
    }
    interface Robot {
        void useElectricity();
    }

    public <T extends Human & Robot> void hybridWorks(T o){
        o.steal();
        o.useElectricity();
    }

    public static void main(String[] args) {
        class Eddie implements Human {
            @Override
            public void steal() {
                System.out.println("Nooo!");
            }
        }
        interface Fullminator extends Human, Robot{
            @Override
            default void steal() {
                System.out.println("steal");
            }

            @Override
            default void useElectricity() {
                System.out.println("power hungry");
            }
        }
        new IntersectionTypes().hybridWorks(new Fullminator(){});
//        new IntersectionTypes().hybridWorks(new Eddie());
    }
}

