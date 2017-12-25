package com.gmail.sergejpsh.l04;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class DogMain {

    public static void main(String[] args) {

        TreeSet<Dog> list = new TreeSet<>(new DogComparator());

        list.add(new Dog("Bob", 3));
        list.add(new Dog("Ben", 2));

        System.out.println(list.toString());

        Comparator comparator = new Comparator<Dog>() {
            @Override
            public int compare(Dog o1, Dog o2) {
                return o1.getAge() > o2.getAge() ? 1 : -1;
            }
        };

        TreeSet<Dog> list2 = new TreeSet<>(comparator);
        list.add(new Dog("Bob", 3));
        list.add(new Dog("Ben", 2));

        System.out.println(list2.toString());

        TreeSet<Dog> list3 = new TreeSet<>(((o1, o2) -> o1.getAge() > o2.getAge() ? 1 : -1));
        list.add(new Dog("Bob", 3));
        list.add(new Dog("Ben", 2));

        System.out.println(list3.toString());

    }
	
	//test
}
