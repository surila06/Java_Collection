package org.example.lambda;

public interface MyFunctionalInterface {

    void m1();
    default void m2()
    {
        System.out.println("Default function from MyFunctionalInterface");
    }

    static void m3()
    {
        System.out.println("Static function from MyFunctionalInterface");
    }
}
