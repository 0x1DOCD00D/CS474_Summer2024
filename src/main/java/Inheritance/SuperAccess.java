package Inheritance;

public class SuperAccess {
    public SuperAccess myOwn = this;
    public void f(){ System.out.println("SuperAccess"); }
    class C1 extends SuperAccess {
        public SuperAccess superX =  SuperAccess.this.myOwn;
        public void f(){
            System.out.println("C1");
        }
        class C2 extends C1 {
            SuperAccess superX = C1.this.superX;
            public void f(){ superX.f(); }
        }
    }
    public static void main(String[] args) {
        SuperAccess.C1 o = new SuperAccess().new C1().new C2();
        o.f();
    }
}
