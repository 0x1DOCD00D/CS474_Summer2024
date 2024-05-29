package OOP;

public class ScopyScopes {
    public int VALUE = 10;
    protected static int OBJVALUE = 1;
    static {
        ScopyScopes.OBJVALUE = new ScopyScopes(3).VALUE * 10;
    }
    public ScopyScopes(int v){
        VALUE = v + OBJVALUE; }
    public ScopyScopes(){ VALUE = 1; }
    static {
        ScopyScopes.OBJVALUE *= 2;
    }
    public static class ChildScope extends ScopyScopes {
        protected static int OBJVALUE;
        static {
            OBJVALUE = ScopyScopes.OBJVALUE - 5;
        }
        public ChildScope(){ super(7);}
    }

    public static void main(String[] arg){
        System.out.println(new ScopyScopes(5).VALUE);
        System.out.println(ScopyScopes.OBJVALUE);
        System.out.println(ChildScope.OBJVALUE);
    }
}

