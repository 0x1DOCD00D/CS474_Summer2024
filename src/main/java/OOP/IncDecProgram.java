package OOP;

public class IncDecProgram {
    public static int f(int j) {
        if (j == 3) {        //line 1
            j = --j  +  ++j; //line 2
        }
        return j++; //line 3
    }

    public static void main(String[] args) {
        int j = 0, sum = 0;
        for (int i = 0; i < 5; i++) {
            j = i * f(j); //line 4
            sum += j; //line 5
        }
        System.out.println(j + ", " + sum);
        int a = 1;
        int b = 2;
        System.out.println(++a+b--+a---b++);
        System.out.println(++a+b--+a--);
    }
}
