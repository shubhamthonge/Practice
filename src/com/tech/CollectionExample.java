package com.tech;

import java.util.*;

public class CollectionExample {
    public static void main(String[] args) {
        // Create a list
        List<String> names = new ArrayList<>(Arrays.asList("Raj", "Shubham", "Pournima"));

        // Add an element
        names.add("Atharva");

        // Remove an element
        names.remove("Raj");

        // Check if list contains an element
        System.out.println("Contains Alice? " + names.contains("Alice"));

        // Sort the list
        Collections.sort(names);

        // Iterate and print each name
        names.forEach(System.out::println);
    }
}
