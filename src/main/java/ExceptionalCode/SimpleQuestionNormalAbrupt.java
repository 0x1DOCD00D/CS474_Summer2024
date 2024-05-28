package ExceptionalCode;

public class SimpleQuestionNormalAbrupt {
    private static int field = -1;
    public static int rv() {
        try {
            return 1/++field;
        } catch (Exception e) {
            field++;
        } finally {
            field--;
        }
        return field++ + field--;
    }

    public static void main(String[] args) {
        int a = 0;
        System.out.println(a-- - a-- + ++a/a-- + ++a * a--);
        //0 (-1) - -1 (-2) + -1/-1 (-2) + -1 * -1
        System.out.println(SimpleQuestionNormalAbrupt.rv());
    }
}
