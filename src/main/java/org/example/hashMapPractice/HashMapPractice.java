package org.example.hashMapPractice;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapPractice {

    public static void main(String[] args)
    {
        HashMap<Integer,String> colorMap=new HashMap<>();
        colorMap.put(1,"Red");
        colorMap.put(2,"Green");
        colorMap.put(3,"Orange");
        colorMap.put(4,"Pink");
        colorMap.put(5,"Blue");
        for(Map.Entry x:colorMap.entrySet())
        //for(Map.Entry<Integer,String> x:colorMap.entrySet());
        {
            System.out.println("Key : "+x.getKey()+ " Value : "+x.getValue());
        }

        System.out.println("****************************************************************");


        //program to count the number of key-value mappings in a map
        System.out.println("Number of key-value pairs in the map is : "+colorMap.size());
        //System.out.println("Number of key-value pairs in the map is : "+colorMap.entrySet().size());

        System.out.println("****************************************************************");
        //program to copy all mappings from the specified map to another map

        HashMap<Integer,String> copiedColorMap=new HashMap<>(colorMap);
        //copiedColorMap.putAll(colorMap);
        for (Map.Entry copyMap:copiedColorMap.entrySet())
        {
            System.out.println("key: "+copyMap.getKey()+" value: "+copyMap.getValue());
        }

        System.out.println("****************************************************************");

        //program to remove all mappings from a map

        copiedColorMap.clear();
        System.out.println("After removing all elements size of map is :"+copiedColorMap.size());

        System.out.println("****************************************************************");


        //program to check if a map is empty or not

        System.out.println("Is map empty? "+ (colorMap.isEmpty()?"Yes":"No"));

        System.out.println("****************************************************************");

        //program to get a shallow copy

       // HashMap<Integer,String> shallowCopyMap=colorMap.clone();
        System.out.println("****************************************************************");

        //program to check if the map contains specified key or value

        System.out.println("Check if Map contains key 2 :"+(colorMap.containsKey(2)?"Yes":"No"));
        System.out.println("Check if Map contains value White :"+(colorMap.containsValue("White")?"Yes":"No"));

        System.out.println("****************************************************************");

    //program to create a set view of mappings contained in a map

        System.out.println(colorMap.entrySet());

        System.out.println("****************************************************************");

        //program to get value of a specified key in a map

        System.out.println("The value of the key 3 is: "+colorMap.get(3));

        System.out.println("****************************************************************");

        //program to get the set view of the keys in a map

        System.out.println("Set view of the keys in the map: "+ colorMap.keySet());

        System.out.println("****************************************************************");

        //get collection view of values  of the map

        System.out.println("Set view of values in a map:"+colorMap.values());

        System.out.println("****************************************************************");

        //add key-value pair only if it is not present

        colorMap.putIfAbsent(6,"White");
        colorMap.putIfAbsent(7,"Black");
        System.out.println(colorMap);
        System.out.println("****************************************************************");

        // remove a key value pair if and only the key is currently mapped to the value

        colorMap.remove(7,"Black");
        colorMap.remove(6,"Maroon");
        System.out.println(colorMap);
        System.out.println("****************************************************************");


       // replace a value associated with a given key in hashmap

        colorMap.replace(6,"White","Violet");
        System.out.println(colorMap);

        //synchronized hashmap

        Map<Integer,String> syncMap=Collections.synchronizedMap(colorMap);
    }







}
