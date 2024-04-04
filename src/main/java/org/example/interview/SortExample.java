package org.example.interview;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class SortExample {

    public static void main(String[] args)
    {
        ArrayList<Integer> marks=new ArrayList<>();
        marks.add(12);
        marks.add(34);
        marks.add(6);

        System.out.println(marks);
        Collections.sort(marks);
        System.out.println(marks);


        ArrayList<Emp> emplList=new ArrayList<>();
        emplList.add(new Emp("Surila","8895844328",100));
        emplList.add(new Emp("Ashish","8895844321",12));
        emplList.add(new Emp("Malang","8895844322",3));
        emplList.add(new Emp("Mayani","8895844323",44));
        System.out.println(emplList);
       // Collections.sort(emplList);
       // System.out.println("After using Comparable :"+emplList);
        Collections.sort(emplList,new IdComparator());
        System.out.println("After using IdComparator :"+emplList);

        Collections.sort(emplList,new NameComparator());
        System.out.println("After using NameComparator :"+emplList);


    }
}
