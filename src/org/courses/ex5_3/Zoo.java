package org.courses.ex5_3;

import java.util.ArrayList;

public class Zoo {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.ensureCapacity(8);
        list.add(0, "Elephant");
        list.add(1, "Tiger");
        list.add(2, "Lion");
        list.add(3, "Giraffe");
        list.add(4, "Monkey");
        list.add(5, "Jaguar");
        list.add(6, "Zebra");
        list.add(7, "Camel");

        list.remove("Tiger");
        list.remove(2);
        list.remove("Monkey");

        System.out.println(list.size());
        System.out.println(list);

        list.remove("Camel");
        list.remove(0);

        System.out.println(list.size());
        System.out.println(list);

        list.remove("Zebra");
        list.remove("Jaguar");

        System.out.println(list.size());
        System.out.println(list);

    }
}

