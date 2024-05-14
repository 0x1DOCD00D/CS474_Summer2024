package OOP;

public abstract class Person {
    enum EMPLOYMENT {
        EMPLOYED, JOBLESS, PARTTIME
    };
    EMPLOYMENT lof;//level of emp
    abstract float production();
    public Person(EMPLOYMENT e){
        lof = e;
    }
    public Person(){
        lof = EMPLOYMENT.JOBLESS;
    }
}

class OfficeWorker extends Person {
    @Override
    float production() {
        return 1.0f;
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




