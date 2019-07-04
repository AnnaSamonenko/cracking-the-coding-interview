package com.gmail.samonenko.arrays_and_strings;

public class StringCompression {

    private static String test = "aabcccccaaa";

    public static void main(String[] args) {
        System.out.println(compress(test));
    }

    public static String compress(String str) {
        StringBuilder res = new StringBuilder();
        int counter = 1;
        int i;
        for (i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                counter++;
            }
            else {
                res.append(str.charAt(i)).append(counter);
                counter = 1;
            }
        }
        res.append(str.charAt(i)).append(counter);
        return res.toString();
    }
}
