package Interfaces;

interface IEngine {
    int rpm = 0;
    default void Start(float averageRpm){
        System.out.println("Rough start " + averageRpm);
    }
    default void Start(double averageRpm){
        System.out.println("Precise start " + averageRpm);
    }
}

public class ExamEngine implements IEngine{
    int rpm = 100;
    private ExamEngine(){
        IEngine.super.Start(10.8);
        getMaxDistance();
    }
    void getMaxDistance(){
        System.out.println("ElectricEngine:" + rpm);
    }
    class TeslaElectricEngine extends ExamEngine {//implements IEngine {
        private int rpm = 500;
        protected TeslaElectricEngine(){
            super.Start(3.51);
        }
        @Override void getMaxDistance(){
            rpm = 800;
            System.out.println("TeslaElectricEngine:" + rpm);
        }
    }
    public static void main(String[] args) {
        ExamEngine e = new ExamEngine().new TeslaElectricEngine();
    }
}

