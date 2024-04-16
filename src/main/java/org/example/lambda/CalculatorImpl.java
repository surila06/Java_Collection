package org.example.lambda;

interface Calculator{
     //void switchOn();

    //void sum(int input);

    int add(int a, int b);
}

public class CalculatorImpl {


  /*  @Override
    public void switchOn() {
        System.out.println("Switch on");
    }*/
    public static void main(String[] args)
    {
        /*Calculator calc=()->System.out.println("Switch on");
        calc.switchOn();*/


      /*  Calculator calc=(a)->{
            System.out.println("Sum is "+a);
        };
        calc.sum(5);*/

        Calculator calc=(a,b)-> (a+b);
        System.out.println(calc.add(12345,94874));


        }


    }

