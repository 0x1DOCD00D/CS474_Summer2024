package Generics;

import java.util.List;
import java.util.Arrays;

public class Pair<T extends String> {
    private final T first;
    private final T second;

    public Pair(T first, T second) {
        this.first = first;
        this.second = second;
    }

    public T first() {
        return first;
    }

    public T second() {
        return second;
    }

    public List<String> stringList() {
        return Arrays.asList(
                String.valueOf(first),
                String.valueOf(second));
    }

    public static void main(String[] args) {
        class C1 {}
        class C2 extends C1 {}
        C1 c1 = new C1();
        C2 o1 = (C2)c1;
        Object o = new Object();
        String s1 = (String) o;
        Pair <String>p = new Pair<String>("MTWTH", "CS474");
        System.out.println(p.first() + " " + p.second());
        for (String s : p.stringList()) System.out.print(s + " ");
    }
}