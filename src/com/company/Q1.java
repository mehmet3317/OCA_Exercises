package com.company;

//Test.java
//package com.udayan.oca;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Q1 {
    public static void main(String[] args) {
        List<String> dryFruits = new ArrayList<>();
        dryFruits.add("Walnut");
        dryFruits.add("Apricot");
        dryFruits.add("Almond");
        dryFruits.add("Date");

        Iterator<String> iterator = dryFruits.iterator();
        while(iterator.hasNext()) {
            String dryFruit = iterator.next();
            if(dryFruit.startsWith("A")) {
                dryFruits.remove(dryFruit);
            }
        }

        System.out.println(dryFruits);
    }
}
    //If you want to remove the items from ArrayList,
// while using Iterator or ListIterator,
// then use Iterator.remove() or ListIterator.remove()
// method and NOT List.remove(...) method. Using List.remove(...) method
// while iterating the list (using the Iterator/ListIterator or for-each)
// may throw java.util.ConcurrentModificationException.

