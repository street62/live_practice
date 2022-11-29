package org;

import java.util.Objects;

public class DataStructure {

    public static class LinkedList {
        private Node head;

        public LinkedList() {
        }

        public boolean add(String value) {
//            if (Objects.isNull(head)) {
//                head = new Node(value);
//                return true;
//            }
//            Node cur = head;
//            while (cur != null) {
//
//            }
            return false;
        }
    }
    public static class Node {
        private String value;
        private Node next;

        public Node(String value) {
            this.value = value;
        }


    }


}
