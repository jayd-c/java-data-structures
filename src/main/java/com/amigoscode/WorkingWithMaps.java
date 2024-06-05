package com.amigoscode;

import java.util.HashMap;
import java.util.Map;

public class WorkingWithMaps {
    public static void main(String[] args) {

        Map<Integer,Person> map = new HashMap<>();
        map.put(1, new Person("Alex", 5));
        map.put(1, new Person("Mariam", 15)); //in this case Mariam will be added as the key is same and last to add
        map.put(2, new Person("sakk",45));
        map.put(3,new Person("kkak",56));

        System.out.println(map);
        System.out.println(map.size());
        System.out.println(map.get(1));
        System.out.println(map.containsKey(4));
        System.out.println(map.keySet());
        System.out.println(map.entrySet());

        System.out.println("***".repeat(10));

        map.forEach((key, value) -> System.out.println(value.name()));

        map.entrySet().forEach(System.out::println);
        System.out.println("IIIIDD".repeat(20));
        System.out.println(map.values());

    }
}
