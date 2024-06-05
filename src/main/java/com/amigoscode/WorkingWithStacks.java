package com.amigoscode;

import java.util.List;
import java.util.Stack;

public class WorkingWithStacks {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.pop();
        System.out.println("peek method shows me? " + stack.peek());
        System.out.println(stack);

        List<String> stringStack = new Stack<>();
        stringStack.add("John");
        stringStack.add("Khan");
        stringStack.add("Pahan");
        stringStack.add("Mahal");

        System.out.println(stringStack);
    }
}
