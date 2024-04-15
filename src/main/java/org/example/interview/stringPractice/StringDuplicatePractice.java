package org.example.interview.stringPractice;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Stream;

public class StringDuplicatePractice {

    public static void main(String[] args)
    {
        //remove duplicates

        //using java 8

        String input="programming";
        StringBuilder sb=new StringBuilder();

        input.chars().distinct().forEach(c->sb.append((char)c));
        System.out.println("Removing duplicates using Java8 "+sb);


        //using indexOf

        StringBuilder sb2=new StringBuilder();
        for(int i=0;i<input.length();i++)
        {
            char ch=input.charAt(i);
            int index=input.indexOf(ch,i+1);
            if(index==-1)
            {sb2.append(ch); }


        }

        System.out.println("Removing duplicates using indexOf() "+sb2);


        //using toCharArray();

        char[] charArr=input.toCharArray();
                StringBuilder sb3=new StringBuilder();
        for(int i=0;i<charArr.length;i++)
        {
            boolean repeated=false;
            for(int j=i+1;j<charArr.length;j++)
            {

                if(charArr[i]==charArr[j])
                {
                    repeated=true;
                    break;

                }
            }
            if(!repeated) {
                sb3.append(charArr[i]);
            }
        }

        System.out.println("Removing duplicates using toCharArray() "+sb3);


        //using the set interface

        StringBuilder sb4= new StringBuilder();
        Set<Character> charSet=new LinkedHashSet<>();
        for(int m=0;m<input.length();m++)
        {
            Character ch=input.charAt(m);
            charSet.add(ch);
        }

        for(Character ch1:charSet)
        {
            sb4.append(ch1);
        }
        System.out.println("removing duplicates using set Interface "+ sb4);


    }


}
