package com.example.java.lesson6;

public class StringMethods {
    public static void main(String[] args) {
        String s = "Some Text String ";
        String s1 = "sometextstring";
        s.concat(s1); //Concats strings
        String.valueOf(100); // Transforms to string
        // System.out.println( String.join(", ", s));
        System.out.println(s.charAt(1));
        // s.getChars();
        System.out.println(s.equals(s1));
        System.out.println(s.equalsIgnoreCase(s1));
        System.out.println(s.trim());
        System.out.println(s.substring(5));
        System.out.println(s.substring(5, 8));
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
        System.out.println(s.startsWith("Some"));
        System.out.println(s.endsWith("String "));
        System.out.println(s.endsWith("String "));
    }
}
