package org.example.interview.stringPractice;

import java.lang.reflect.Array;
import java.util.Arrays;

public class StringSortingPractice {

    public static void main(String[] args)
    {


        String input="ashish";
        System.out.println("Given input String: "+input);


        //without sorting method
        char[] charArr=input.toCharArray();
        char temp;

        for(int i=0;i<charArr.length;i++)
        {
            for(int j=1;j<charArr.length;j++)
            {
                if(charArr[i]>charArr[j])
                {
                    temp=charArr[i];
                    charArr[i]=charArr[j];
                    charArr[j]=temp;
                }
            }
        }

       // System.out.println("Sorted output string: "+new String(charArr));

        //with sorting
        Arrays.sort(charArr);
        System.out.println("Sorted output string: "+new String(charArr));
    }
}
