package org.example.interview.stringPractice;

import java.util.HashMap;
import java.util.Map;

public class StringFindLongestNonRepeatingSubstring {

    public static void main(String[] args)
    {
        String input="java";

        lengthofLongestNonRepeatingSubstring(input);
    }

    private static void lengthofLongestNonRepeatingSubstring(String input) {

        int lengthOfLongestNonRepeatingSubstring=0;
        String longestNonRepeatingSubstring="";

        char[] charArr= input.toCharArray();
        Map<Character,Integer> map=new HashMap<>();

        for(int i=0;i<charArr.length;i++)
        {
            char ch=charArr[i];
            if(!map.containsKey(ch))
            {
                map.put(ch,i);//a-0,b-1,
            }
            else{
                i=map.get(ch);//i=1
                map.clear();
            }
        }

        if(map.size()>lengthOfLongestNonRepeatingSubstring)
        {
            lengthOfLongestNonRepeatingSubstring=map.size();
            longestNonRepeatingSubstring=map.keySet().toString();
        }
        System.out.println("Longest non repeating substring is : "+longestNonRepeatingSubstring);
        System.out.println("length of longest non repeating substring is "+lengthOfLongestNonRepeatingSubstring);

    }
}
