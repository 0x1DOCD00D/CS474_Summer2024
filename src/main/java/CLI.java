import java.util.Scanner;

public class CLI {
    public boolean getCLI(int allowed) {
        System.out.print("Enter an integer, preferrably " + allowed + ": ");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt() == allowed;
    }

    public int getInput() {
        System.out.print("\nEnter an integer: " );
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    private int getCLINumber(Scanner sc) {
        try {
            if(sc != null) {
                sc.nextInt();
            } else {
                System.out.println("Scanner is null");
                System.exit(1);
            }
        } catch (Exception e) {
            System.out.println("Invalid input, try again.");
        }
        return getCLINumber(sc);
    }
    public int getCLI() {
        System.out.print("Enter an integer: ");
        Scanner sc = new Scanner(System.in);
        return getCLINumber(sc);
    }
    public static void main(String[] args) {
        System.out.println(new CLI().getCLI(1));
        System.out.println(new CLI().getInput());
    }
}