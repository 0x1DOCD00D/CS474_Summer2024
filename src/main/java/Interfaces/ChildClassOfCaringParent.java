package Interfaces;

interface DefaultMethodInferace {
    default void m(){
        System.out.println("Default method of the interface");
    }
}

class CaringParent implements DefaultMethodInferace {
    @Override public void m(){
        System.out.println("Caring parent");
    }
}

class ChildClassOfCaringParent extends CaringParent implements DefaultMethodInferace{
    @Override public void m(){
        System.out.println("Careless child");
    }
    public static void main(String[] args) {
        CaringParent parent = new ChildClassOfCaringParent();
        parent.m();
    }
}


