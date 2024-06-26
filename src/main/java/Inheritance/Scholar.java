package Inheritance;

public class Scholar {
    public int doSomethingCool() {
        return 0;
    }

    public static void main(String[] args) {
        Scholar obj = new Professor();
        Scholar [] scholars = {new Scholar(), new Professor(), new Postdog(), new Student(), new Student()};
        CLI inp = new CLI();
        int ind = inp.getInput();
//        if scholars[ind] instanceof Student ? ((Student) scholars[ind]) : null;

        Integer res = scholars[ind].doSomethingCool();
        System.out.println(res.toString());
        for (int i = 0; i < 5; i++) {
            System.out.println(scholars[i].doSomethingCool());
        }
    }
}

class Student extends Scholar{
    @Override
    public int doSomethingCool() {
        return 1;
    }
}

class Professor extends Scholar {
    @Override
    public int doSomethingCool() {
        return 2;
    }
}

class Postdog extends Scholar{
    @Override
    public int doSomethingCool() {
        return 3;
    }
}