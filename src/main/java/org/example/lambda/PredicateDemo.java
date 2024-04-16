package org.example.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo {


    public static void main(String[] args) {
        Predicate<Integer> predicateDemo= i->i%2==0;
       // System.out.println("The given number is even number? "+predicateDemo.test(18));

        List<Integer> numList= Arrays.asList(1,2,3,4,5,6);
      //  numList.stream().filter(predicateDemo).forEach(t-> System.out.println("Even number: "+t));
        numList.stream().filter(i->i%2==0).forEach(t-> System.out.println("Even number: "+t));
    }
}
