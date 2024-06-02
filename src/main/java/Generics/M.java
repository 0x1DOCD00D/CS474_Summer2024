package Generics;

import java.sql.SQLException;

//public class M<T extends Exception> {

public class M<T extends Exception> {
    class C1 {}
    class C2 extends C1 {}
    class C3 extends C1 {}
    private void throwIt( final SQLException t ) throws T {
//        C3 c3 = new C3();
//        C2 c2 = (C2)c3;
        throw (T)t;
    }

    public static void main(String[] args) {
        try {
            new M<RuntimeException>().throwIt(new SQLException());

        } catch(final RuntimeException ex){

            ex.printStackTrace();
        }
    }
}

