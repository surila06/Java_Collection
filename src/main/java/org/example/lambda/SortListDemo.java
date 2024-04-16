package org.example.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortListDemo {

    public static void main(String[] args) {

        List<Integer> list= new ArrayList<>();
        list.add(8);
        list.add(3);
        list.add(12);
        list.add(5);
        /*Collections.sort(list);
        Collections.reverse(list);
        System.out.println(list);*/

       // list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()).stream().forEach(t->System.out.println(t));
       // System.out.println(list);


        List<Employee> employeeList=new ArrayList<>();
        employeeList.add(new Employee(176,"Ram","MECH",600000));
        employeeList.add(new Employee(178,"Arjun","EE",400000));
        employeeList.add(new Employee(180,"Krishna","MECH",800000));
        employeeList.add(new Employee(182,"Mehak","ETC",500000));
        employeeList.add(new Employee(184,"Kiran","MECH",1100000));
        employeeList.add(new Employee(186,"Pankaj","CHEM",1200000));
        employeeList.add(new Employee(188,"Swagat","EE",900000));


       /* Collections.sort(employeeList,(e1,e2)->((int)(e2.getSalary()-e1.getSalary())));
        System.out.println(employeeList);*/

       List<Employee> employeeSortedList=employeeList.stream().sorted((e1,e2)->((int)(e2.getSalary()-e1.getSalary()))).collect(Collectors.toList());
       employeeList.stream().sorted(Comparator.comparing(e->e.getSalary())).forEach(System.out::println);
       employeeList.stream().sorted(Comparator.comparing(Employee::getDept)).forEach(System.out::println);
        System.out.println(employeeSortedList);







    }
}
