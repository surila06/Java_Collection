package org.example.lambda;

import java.util.*;
import java.util.stream.Collectors;

public class ForEachAndFilterDemo {

    public static void main(String[] args) {
        List<String> names= Arrays.asList("amy","jack","jill","ryan","dev");
        /*for(String name:names)
        {
            System.out.println(name);
        }*/

      //  names.stream().forEach((t)-> System.out.println(t));

        //names.stream().filter(t->t.startsWith("j")).forEach(t-> System.out.println(t));

        Map<Integer,String> map=new HashMap<>();
        map.put(1,"amy");
        map.put(2,"sona");
        map.put(3,"mini");
        map.put(4,"lizi");
        map.put(5,"tom");
        map.put(6,"maxi");

        //map.forEach((key,value)-> System.out.println("key: "+key+" value: "+value));
        //map.entrySet().stream().forEach((object)-> System.out.println(object));
       // map.entrySet().stream().filter(t->t.getValue().startsWith("m")).forEach(t-> System.out.println(t.getValue()));


        List<Employee> employeeList=new ArrayList<>();
        employeeList.add(new Employee(176,"Ram","MECH",600000));
        employeeList.add(new Employee(178,"Arjun","EE",400000));
        employeeList.add(new Employee(180,"Krishna","MECH",800000));
        employeeList.add(new Employee(182,"Mehak","ETC",500000));
        employeeList.add(new Employee(184,"Kiran","MECH",1100000));
        employeeList.add(new Employee(186,"Pankaj","CHEM",1200000));
        employeeList.add(new Employee(188,"Swagat","EE",900000));


      evaluateTax(employeeList,"Tax");




    }
    public static void evaluateTax(List<Employee> empList,String input)
    {
        if(input.equalsIgnoreCase("tax")) {
            empList.stream().filter(t -> t.getSalary() >= 500000).collect(Collectors.toList()).stream().forEach(t -> System.out.println("Tax Payer: "+t.getName()));
        }
        else
        {
            empList.stream().filter(t -> t.getSalary() < 500000).collect(Collectors.toList()).stream().forEach(t -> System.out.println("Non Tax Payers: "+t.getName()));
        }
        //return eligibleTaxPayers;
    }
}
