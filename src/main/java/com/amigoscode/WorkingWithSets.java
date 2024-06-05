package com.amigoscode;

import java.util.HashSet;
import java.util.Set;

record Ball(String color) {}

public class WorkingWithSets {
    public static void main(String[] args) {

        Set<Ball> balls = new HashSet<>();
        balls.add(new Ball("Yellow"));
        balls.add(new Ball("Green"));
        balls.add(new Ball("Red"));
        balls.add(new Ball("Blue"));
        balls.add(new Ball("Orange"));



        balls.forEach(System.out::println);

    }
}
