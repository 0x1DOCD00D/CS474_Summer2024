package OOP;

public class SubtypingExercise1 {
    public int field = 1;
    public SubtypingExercise1() {
        System.out.println("SubtypingExercise1's constructor");
        field = 10;
        f();
    }
    public void f(){
        System.out.println("SubtypingExercise1 field = " + String.valueOf(field));
    }
    class InnerClass extends SubtypingExercise1 {
        public int field = 2;
        public InnerClass(){
            System.out.println("InnerClass' constructor");
            SubtypingExercise1.this.field = 100;
            f();
        }
        public void f(){
            System.out.println("InnerClass field = " + String.valueOf(field));
        }
    }
    public static void main(String[] args) {
        new SubtypingExercise1().new InnerClass();
    }
}
