package com.amigoscode;

import java.util.*;

public class WorkingWithQueues
{
    public static void main(String[] args) {

//        queues();

        List<Person> linkedList = new LinkedList<>();
        linkedList.add(new Person("Sanana",16));
        linkedList.add(new Person("Alex", 24));
        linkedList.add(new Person("Maira", 56));

        ListIterator<Person> personListIterator = linkedList.listIterator();
        System.out.println("List iterator hasNext()**************************************");

        while (personListIterator.hasNext()) {
            System.out.println(personListIterator.next());
        }

        System.out.println("List iterator hasPrevious()**************************************");
        while (personListIterator.hasPrevious()) {
            System.out.println(personListIterator.previous());
        }


        System.out.println(linkedList);

    }

    private static void queues() {
        Queue<Person> superMarketLine = new LinkedList<>();
        superMarketLine.add(new Person("Sanana",16));
        superMarketLine.add(new Person("Alex", 24));
        superMarketLine.add(new Person("Maira", 56));

        System.out.println(superMarketLine.peek());
        System.out.println(superMarketLine.poll());
        System.out.println(superMarketLine.remove());
        System.out.println(superMarketLine.remove());
//        System.out.println(superMarketLine.remove()); this will give axception so use the following method

        System.out.println(superMarketLine.poll());


        System.out.println(superMarketLine.size());
    }
}
