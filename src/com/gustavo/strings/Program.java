package com.gustavo.strings;

public class Program {
    public static void main(String[] args) {
        String original = "abcd hfdgs ahshabcHASabcHS  AaA   ";

        String s1 = original.toLowerCase();
        String s2 = original.toUpperCase();
        String s3 = original.trim();
        String s4 = original.substring(3);
        String s5 = original.substring(3, 9);
        String s6 = original.replace("a", "x");
        String s7 = original.replace("abc", "xy");
        int i = original.indexOf("bc");
        int j = original.lastIndexOf("bc");

        System.out.println("Original: -" + original + "-");
        System.out.println("toLowerCase: -" + s1 + "-");
        System.out.println("toUpperCase: -" + s2 + "-");
        System.out.println("trim: -" + s3 + "-");
        System.out.println("substring: -" + s4 + "-");
        System.out.println("substring: -" + s5 + "-");
        System.out.println("replace('a','x'): -" + s6 + "-");
        System.out.println("replace('abc','xy'): -" + s7 + "-");
        System.out.println("indexOf: -" + i + "-");
        System.out.println("lastIndexOf: -" + j + "-");

        String s = "potato apple lemon";
        String[] vect = s.split(" ");
        String word1 = vect[0];
        String word2 = vect[1];
        String word3 = vect[2];

        System.out.println(word1);
        System.out.println(word2);
        System.out.println(word3);

    }

}
