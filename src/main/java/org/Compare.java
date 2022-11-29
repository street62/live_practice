package org;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Compare {

    public static void main(String[] args) {
        Laptop laptop1 = new Laptop(242, "apple");
        Laptop laptop2 = new Laptop(22, "zebra");
        Laptop laptop3 = new Laptop(34, "banana");

        List<Laptop> laptops = new ArrayList<>(List.of(laptop1, laptop2, laptop3));

        Collections.sort(laptops, (l1, l2) -> l1.name.compareTo(l2.name));
        Collections.sort(laptops, (l1, l2) -> l1.id - l2.id);
        System.out.println(laptops);

    }
    public static class Laptop {
        private int id;
        private String name;

        public Laptop(int id, String name) {
            this.id = id;
            this.name = name;
        }

        @Override
        public String toString() {
            return "Laptop{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    '}';
        }
    }



}
