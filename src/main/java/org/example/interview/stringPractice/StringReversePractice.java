package org.example.interview.stringPractice;

public class StringReversePractice {

    public static void main(String[] args)
    {
        // reverse the given string using charArray
        //input string="hello";
        //output string="olleh";

        String input="hello";
        String output="";
        System.out.println("Input string is: "+input);
        char[] ch=input.toCharArray();
        for(int i=input.length()-1;i>=0;i--)
        {
            output+=ch[i];

        }
        System.out.println("output String using toCharArray() is : "+output);


        //reverse using charAt()
    String output2="";
        for(int i=input.length()-1;i>=0;i--)
        {
            output2+=input.charAt(i);
        }
        System.out.println("output String using charAt(int index) is  : "+output2);


        //reverse using StringBuffer class
        StringBuffer sb=new StringBuffer(input);
        System.out.println("output String using StringBuffer reverse() is  : "+sb.reverse());

        //reverse using StringBuilder class
        StringBuilder sb1=new StringBuilder(input);
        System.out.println("output String using StringBuilder reverse() is  : "+sb1.reverse());
    }
}
