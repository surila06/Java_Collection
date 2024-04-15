package org.example.interview.stringPractice;

import java.util.HashMap;
import java.util.Map;

public class StringFindFirstNonRepeatedChar {

    public static void main(String[] args)
    {
        String input="AABCDBE";
        //without using collections
        for(int i=0;i<input.length();i++)
        {
            boolean unique=true;
            for(int j=0;j<input.length();j++)
            {
                if(i!=j && input.charAt(i)==input.charAt(j))
                {
                    unique=false;
                    break;
                }
            }

            if(unique)
            {
                System.out.println(input.charAt(i));
                break;
            }
        }

        //using collections map interface;
        char[] chrArr=input.toCharArray();
        Map<Character,Integer> map1=new HashMap<>();

        for(Character ch:chrArr)
        {
            if (map1.containsKey(ch))
            {
                map1.put(ch, map1.get(ch)+1);
            }
            else {
                map1.put(ch,1);
            }
        }

        for(Map.Entry entry: map1.entrySet())
        {
            if(entry.getValue().equals(1))
            {
                System.out.println(entry.getKey());
                break;
            }
        }
    }
}
