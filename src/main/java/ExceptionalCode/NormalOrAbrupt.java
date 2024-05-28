package ExceptionalCode;

public class NormalOrAbrupt {
    private static int x = -1;

    public static int method() {
        try {
            try {
                ++x;            //line 1
                return 1 / x--; //line 2
            } catch (Throwable e) {
                return --x;     //line 3
            } finally {
                try {
                    throw new Exception();//line 4
                } catch (Throwable e) {
                    return --x;
                }
            }
        } catch (ArithmeticException e) {
            return x++;//line 7
        } finally {
            ++x;//line 8
        }
    }

    public static void main(String[] args) {
        System.out.println(NormalOrAbrupt.method());
    }
}