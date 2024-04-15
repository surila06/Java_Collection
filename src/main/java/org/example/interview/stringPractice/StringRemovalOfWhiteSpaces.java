package org.example.interview.stringPractice;

public class StringRemovalOfWhiteSpaces {

    public static void main(String[] args) {
        String input = "   j a va  s ta r  ";
        String removedSpacesString = input.replaceAll("\\s","");
        String trimmedString=input.trim();

        System.out.println("Given input string is: "+input);
        System.out.println("String after removing all white spaces: "+removedSpacesString);
        System.out.println("String after removing all leading and trailing spaces: "+trimmedString);


        String specialCharacterString="$ja!va$st%ar";
        String plainString=specialCharacterString.replaceAll("[^a-zA-Z0-9]","");
        System.out.println("Given input string with special characters is: "+specialCharacterString);
        System.out.println("String after removing all special characters: "+plainString);

    }

    }
