package sdetFramework;

import java.util.HashSet;

public class Activity3_2 {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<String>();
        hs.add("Earth");
        hs.add("Fire");
        hs.add("Water");
        hs.add("Air");
        hs.add("Plant");
        hs.add("Iron");
        
        //Print HashSet
        System.out.println("Original HashSet: " + hs);        
        //Print size of HashSet
        System.out.println("Size of HashSet: " + hs.size());
        
        //Remove element
        System.out.println("Removing A from HashSet: " + hs.remove("Fire"));
        //Remove element that is not present
        if(hs.remove("Copper")) {
        	System.out.println("Copper removed from the Set");
        } else {
        	System.out.println("Copper is not present in the Set");
        }
        
        //Search for element
        System.out.println("Checking if Air is present: " + hs.contains("Air"));
        //Print updated HashSet
        System.out.println("Updated HashSet: " + hs);
    }
}