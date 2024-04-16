package org.example.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierDemo {

    /*@Override
    public String get() {
        return "Hello Surila";
    }*/


    public static void main(String[] args) {
        /*Supplier<String> supplier=new SupplierDemo();
        supplier.get();*/

        Supplier<String> supplierTest=()->"Hello Surila";
        //System.out.println(supplierTest.get());

        List<String> names= Arrays.asList("amy","jack","jill","ryan","dev");
        System.out.println( names.stream().findAny().orElseGet(()->"No names found"));
    }
}
