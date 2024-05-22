package Interfaces;

interface Workshop {
    public int x = 3;
    class Yurii{}
    public Yurii m = new Yurii();
    void method();
}
public class InterfaceWorkshop {
    public static void main(String[] args) {
        new Workshop(){
            @Override
            public void method() {
                System.out.println("Howdy!");
            }
        }.method();
    }
}
