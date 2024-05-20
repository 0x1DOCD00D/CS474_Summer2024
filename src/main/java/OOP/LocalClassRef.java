package OOP;

public class LocalClassRef {
    public LocalClassRef getID() {
        class Subclass extends LocalClassRef { }
        LocalClassRef instanceS = new Subclass();
        return instanceS.getID();
    }
    public static void main(String[] args) {
        System.out.println(new LocalClassRef().getID());
    }
}
