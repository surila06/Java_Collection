package org.example.interview.stringPractice;

public class StringReverseEachWordOfSentence {

    public static void main(String[] args)
    {
         //reverse each word of sentence

        String input="This is Surila's code";
        System.out.println("Original String "+input);
        String[] strArr=input.split(" ");
        String rev="";
        for(String str:strArr)
        {

            String reversedWord="";
            for(int i=str.length()-1;i>=0;i--)
            {

                reversedWord+=str.charAt(i);
            }
            rev=rev+reversedWord+" ";
        }

        System.out.println("Reversed String "+rev);

    }
}
