package main.test.java;

import main.java.adapterpattern.arraylistexample.EnumerationAdapter;

import java.util.*;

public class ArrayListEnumerationAdapterTest {
    public static void main(String[] args) {
        List<Integer> arrlist = new ArrayList<>(
                Arrays.asList(1, 2 , 3, 4 ,5)
        );
        ListIterator<Integer> it = arrlist.listIterator();
        Enumeration<Integer> en = new EnumerationAdapter(it);
        System.out.println("Array elements:");
        while (en.hasMoreElements()) {
            System.out.println(en.nextElement());
        }
    }
}
