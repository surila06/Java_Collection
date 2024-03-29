package org.example.arrayPractice;

import java.util.*;

public class ArrayListPractice {

    public static void main(String[] args) {
        //create an arraylist, add colours and print out collection

        List<String> colourList = new ArrayList<>();
        colourList.add("Red");
        colourList.add("Green");
        colourList.add("Black");
        colourList.add("Orange");
        colourList.add("White");
        colourList.add("Pink");
        colourList.add("Blue");
        colourList.add("Brown");
        colourList.add("Grey");
        colourList.add("Teal");
        colourList.add("Lavender");
        System.out.println(colourList);
        for (String colors : colourList) {
            System.out.println(colors);
        }

        colourList.forEach(n->System.out.println(n));

        ListIterator<String> itr = colourList.listIterator();
        while (itr.hasNext()) {
            System.out.println("colour is :" + itr.next());
        }

        //insert and retrieve on a particular index

        colourList.add(0, "Maroon");

        System.out.println(colourList.get(4));

        //update an element with a given value
        String oldColor = "Maroon";
        String newColor = "Violet";
        int index = 0;
        try {
            index = colourList.indexOf(oldColor);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Color not found" + e.getLocalizedMessage());
        }
        colourList.set(index, newColor);
        colourList.forEach(System.out::println);

        //remove the third element from array.
        System.out.println(colourList.remove(3));

        //search for an element in arrayList
        int indexOfElement = 0;
        try {
            indexOfElement = colourList.indexOf("Red");
        } catch (Exception e) {
            System.out.println(e.getStackTrace());
        }
        if (indexOfElement >= 0) {
            System.out.println("Element was first found at index:" + indexOfElement);

        } else {
            System.out.println("Element not found in the list");
        }

        if (colourList.contains("Purple")) {
            System.out.println("Element was  found ");

        } else {
            System.out.println("Element not found in the list");
        }

        //sort an arrayList

        System.out.println("List before sorting:" + colourList);
        Collections.sort(colourList);
        System.out.println("List after sorting:" + colourList);


//copying one arrayList to another;

        List<String> newColorList = new ArrayList<>();
        newColorList.add("Red11");
        newColorList.add("Green11");
        newColorList.add("Black11");
        newColorList.add("Orange11");
        newColorList.add("White11");
        newColorList.add("Pink11");
        newColorList.add("Blue11");
        newColorList.add("Brown11");
        newColorList.add("Grey11");
        newColorList.add("Teal11");
        newColorList.add("Lavender11");


        // System.out.println("Old color list: before copying: "+newColorList);
        // Collections.copy(newColorList,colourList);
        //System.out.println("New color List after copying: "+newColorList);


        //using ArrayListConstructor//shallow copy

        List copiedColorList = new ArrayList<>(colourList);
        System.out.println("Copied color list: " + copiedColorList);

        //shuffle all elements of arrayList
        Collections.shuffle(copiedColorList);
        System.out.println("Shuffled color List: " + copiedColorList);
        Collections.shuffle(copiedColorList, new Random(4));
        System.out.println("Shuffled color List: " + copiedColorList);


        //reverse an arrayList
        System.out.println("ColourList with reverse: " + colourList);
        Collections.reverse(colourList);
        System.out.println("Reversed colorList using reverse method: " + colourList);


        //without reverse function
        List<String> reversedArrayList = new ArrayList<>();
        for (int j = colourList.size() - 1; j >= 0; j--) {
            reversedArrayList.add(colourList.get(j));
        }
        System.out.println("reversed arrayList without function" + reversedArrayList);


        //sublist
        System.out.println("Sublist of coloured array:" + colourList.subList(1, 4));


        //to compare two array
        List<String> newColorList2 = new ArrayList<>();
        newColorList2.add("Red11");
        newColorList2.add("Green11");
        newColorList2.add("Black11");
        newColorList2.add("Orange22");
        newColorList2.add("White11");
        newColorList2.add("Pink11");
        newColorList2.add("Blue22");
        newColorList2.add("Brown22");

        List<String> newCompareColorList = new ArrayList<>();
        for (String s : newColorList) {
            newCompareColorList.add(newColorList2.contains(s) ? "Yes" : "No");

        }
        System.out.println(newCompareColorList);

        //swap two elements
        Collections.swap(colourList, 2, 4);

        //join two arrayList
        List<String> joinedColorList = new ArrayList<>();
        joinedColorList.addAll(colourList);
        joinedColorList.addAll(newColorList);
        System.out.println("joined List:" + joinedColorList);


        //clone arrayList
        // List<String> clonedColorList=new ArrayList<>(colourList.clone());


        //empty an array
        System.out.println("Is list empty? " + newColorList2.isEmpty());

        //trim array
       // newColorList2.trimToSize();
        newColorList2.removeAll(newColorList2);

        System.out.println("Emptied color list: " + newColorList2);

        //print all elements using elements position

        for(int a=0;a<colourList.size();a++)
        {
            System.out.println(colourList.get(a));
        }

    }


}


