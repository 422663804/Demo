package p0714;

import java.lang.annotation.ElementType;

public class Test01 {
    public static void main(String[] args) {
        Class c1 = void.class;
        Class c2 = Integer.class;
        Class c3 = String.class;
        Class c4 = String[].class;
        Class c5 = int[][].class;
        Class c6 = ElementType.class;
        Class c7 = Class.class;
        Class c8 = Override.class;
        Class c9 = Object.class;

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        System.out.println(c5);
        System.out.println(c6);
        System.out.println(c7);
        System.out.println(c8);
        System.out.println(c9);
    }
}

