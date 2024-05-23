package Interfaces;

interface Human {
    int walk();
}

interface Machine {
    int kill();
}

interface Vehicle {}

interface CriminalRecord {

}

class Yurii implements Human, CriminalRecord{
    @Override
    public int walk() {
        return 0;
    }
}

class Terminator implements Human, Machine {
    @Override
    public int walk() {
        return 0;
    }

    @Override
    public int kill() {
        return 10;
    }
}

public class TerminatorDesign {
//    public void action(Human & Machine obj){}
    public static void main(String[] args) {
        Machine m = new Terminator();
        m.kill();
        System.out.println(new Terminator() instanceof Human);
        System.out.println(new Terminator() instanceof Machine);
        System.out.println(new Terminator() instanceof Vehicle);
        System.out.println(new Yurii() instanceof CriminalRecord);
    }
}
