public class SideEffectCode {
    public static int sideEffectVariable;

    public int m(){
        if (sideEffectVariable == 0){}
        else sideEffectVariable++;
        return sideEffectVariable;
    }
    public static void main(String[] args) {
        SideEffectCode o1 = new SideEffectCode();
        SideEffectCode o2 = new SideEffectCode();
        o2.m();
        o1.m();
        System.out.println(o2.m()>o1.m());
    }
}
