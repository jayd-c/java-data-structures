package com.amigoscode;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TheArrays {
    public static void main(String[] args) {
        int[] intArr = new int[10];
        String[] colors = new String[5];
        colors[0] = "Purple";
        colors[1] = "Yellow";
        colors[2] = "Red";
        colors[3] = "Blue";
        colors[4] = "Orange";




        System.out.println(Arrays.toString(colors));
        colors[2]= "black";

        System.out.println(Arrays.toString(colors));

        for(int i = colors.length-1; i>=0; i--) {
            System.out.println(colors[i]);
        }

        for(String s: colors) System.out.println(s);
        System.out.println("*".repeat(100));

        Arrays.stream(colors).forEach(System.out::println);
        System.out.println("!".repeat(100));
        String s = Arrays.toString(colors);
        System.out.println(s);

    }
}
