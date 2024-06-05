package com.amigoscode;

import java.util.Arrays;

public class WorkWith2DArrays {
    public static void main(String[] args) {
        char[][] board = new char[5][5];

        for(int i = 0; i<board.length; i++) {
            for(int j = 0; j<=i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
