package org.example.interview.stringPractice;

import java.util.Arrays;

public class StringReplaceCharacterwithItsOcuurance {

    public static void main(String[] args) {
        String input = "surilaashishyadhuvanshi";
        Character charToBeReplaced='q';

        if(input.indexOf(charToBeReplaced)==-1)
        {
            System.out.println("Character given to be replaces is not found in the String");
            System.exit(0);
        }

        char[] charArr=input.toCharArray();
        int count=1;
        for(int i=0;i<charArr.length;i++)
        {
            if(charArr[i]==charToBeReplaced)
            {
                charArr[i]= String.valueOf(count).charAt(0);
                count++;
            }
        }

        System.out.println("Replaced character with their occurances without replace method: "+ Arrays.toString(charArr));

        //using replace method

        int counter=1;
         for(int i=0;i<input.length();i++)
        {
            if(input.charAt(i)==charToBeReplaced)
            {
                input=input.replaceFirst(String.valueOf(charToBeReplaced),String.valueOf(counter));
                counter++;
            }
        }

        System.out.println("Replaced character with their occurances with replace method: "+input);
    }
}
