package org.example.lambda;


import java.sql.SQLOutput;
import java.util.*;

public class SortMapDemo {

    public static void main(String[] args) {

        Map<String,Integer> map1=new HashMap<>();
        map1.put("eight",8);
        map1.put("one",1);
        map1.put("six",6);
        map1.put("ten",10);
        map1.put("three",3);

        List<Map.Entry<String,Integer>> list1= new ArrayList<>(map1.entrySet());
       /* Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o1.getKey().compareTo(o2.getKey());
            }
        });

        System.out.println(list);*/

       /* Collections.sort(list1,(o1, o2)->o1.getValue()-o2.getValue());
        System.out.println(list1);*/


       // map1.entrySet().stream().sorted(Comparator.comparing(Map.Entry::getKey)).forEach(entry->System.out.println(entry.getKey()+" "+entry.getValue()));
        map1.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);



        System.out.println("****************************************************************");

        map1.entrySet().stream().sorted(Comparator.comparing(e->e.getValue())).forEach(entry->System.out.println(entry.getKey()+" "+entry.getValue()));


        Map<Employee,Integer> employeeMap=new HashMap<>();
        employeeMap.put(new Employee(178,"Arjun","EE",400000),60);
        employeeMap.put(new Employee(180,"Krishna","MECH",800000),90);
        employeeMap.put(new Employee(182,"Mehak","ETC",500000),120);
        employeeMap.put(new Employee(184,"Kiran","MECH",1100000),20);
        employeeMap.put(new Employee(186,"Pankaj","CHEM",1200000),50);
        employeeMap.put(new Employee(188,"Swagat","EE",900000),180);

        List<Map.Entry<Employee,Integer>> empList=new ArrayList<>(employeeMap.entrySet());
        Collections.sort(empList, new Comparator<Map.Entry<Employee, Integer>>() {
            @Override
            public int compare(Map.Entry<Employee, Integer> o1, Map.Entry<Employee, Integer> o2) {
                return (int) (o1.getKey().getSalary()-o2.getKey().getSalary());
            }
        });
        //System.out.println(empList);

        employeeMap.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getName).reversed())).forEach(System.out::println);


    }



}
