package org.example.arrayPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ArraySortUsingComparator implements Comparator<Shop> {

    @Override
    public int compare(Shop o1, Shop o2) {
        if(o1.getStock()==o2.getStock())
        {
            return 0;
        } else if (o1.getStock()>o2.getStock()) {
            return 1;
        }
        else {
            return -1;
        }
    }

    public static void main(String[] args)
    {
        List<Shop> shopList=new ArrayList<>();
        shopList.add(new Shop(410,"Pen",10));
        shopList.add(new Shop(411,"Pencil",20));
        shopList.add(new Shop(412,"Book",15));
        shopList.add(new Shop(413,"Notebook",37));
        shopList.add(new Shop(414,"Eraser",22));
        shopList.add(new Shop(415,"Sharpner",6));

        System.out.println("Shop List before sorting---------");
        shopList.forEach(s-> System.out.println("Product no: "+s.Productno+" ItemName: "+s.shopName+" Stock: "+s.Stock));
        //Collections.sort(shopList,new ArraySortUsingComparator());
        shopList.sort(new ArraySortUsingComparator());
        System.out.println("Shop List after sorting---------");
        shopList.forEach(s-> System.out.println("Product no: "+s.Productno+" ItemName: "+s.shopName+" Stock: "+s.Stock));

    }
}
