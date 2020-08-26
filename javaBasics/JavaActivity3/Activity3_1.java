package sdetFramework;

import java.util.ArrayList;

public class Activity3_1 {
    public static void main(String[] args) {
        ArrayList<String> l = new ArrayList<String>();
        l.add("JAVA");
        l.add("SQL");
        l.add("PYTHON");
        l.add(3, "RUBY");
        l.add(1, "C#");
        for(String x:l){
            System.out.println(x);
        }
        System.out.println("3rd name in the ArrayList: " + l.get(2));
        System.out.println("Is SQL is in list: " + l.contains("SQL"));
        System.out.println("number of names in the ArrayList: " + l.size());
        
        l.remove("C#");
        
        System.out.println("Final Size of ArrayList: " + l.size());
    }
}
