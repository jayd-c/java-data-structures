package com.amigoscode;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

record Diamond(String name){}

class Student{
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;

        return age == student.age && Objects.equals(name, student.name);
    }

//    @Override
//    public int hashCode() {
//        return Objects.hash(name, age);
//    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
public class WorkingWithMaps {
    public static void main(String[] args) {

//        maps();
        Map<Student, Diamond> map = new HashMap<>();
        map.put(new Student("Jamila",16), new Diamond("African Diamond"));
        System.out.println(map.get(new Student("Jamila",16)));

        Student s = new Student("Jammu",15);
        Student t = new Student("Jammu",15);
        System.out.println(s==t);
        System.out.println("S = " +s.hashCode() + " T = "+t.hashCode() );



    }

    private static void maps() {
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
