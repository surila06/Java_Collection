package org.example.interview.stringPractice;

import java.nio.charset.CharsetEncoder;
import java.util.HashMap;
import java.util.Map;

public class StringCountCharecters {

    public static void main(String[] args)
    {
        String input="SurilaAshishYadhuvanshi";

        //to find out occurrences of each character in the string

        Map<Character,Integer> map1= new HashMap<>();
        char[] charArr=input.toCharArray();
        for(Character ch:charArr)
        {
            if(map1.containsKey(ch))
            {
                map1.put(ch, map1.get(ch)+1);
            }
            else {
                map1.put(ch,1);
            }
        }
        for(Map.Entry entry: map1.entrySet())
        {
            System.out.println(entry.getKey()+" - "+entry.getValue());
        }

    }
}
