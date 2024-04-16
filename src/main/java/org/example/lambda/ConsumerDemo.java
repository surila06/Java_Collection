package org.example.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {

    public static void main(String[] args)
    {
      //  Consumer consumerDemo=(i)-> System.out.println("Called from lambda expression "+i);
       // consumerDemo.accept(10);

        List<Integer> numList= Arrays.asList(1,2,3,4,5,6);
        numList.stream().forEach(i-> System.out.println("Called from lambda expression "+i));

    }
}
