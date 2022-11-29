package org;

public class LinkedList {
    public Node head;

    public static class Node {
        private final String value;
        private Node next;

        public Node(String value) {
            this.value = value;
        }
    }

    public void add(String value) {
        if (head == null) {
            head = new Node(value);
            return;
        }

        Node cur = head;
        Node prev = null;
        while (cur != null) {
            prev = cur;
            cur = cur.next;
        }
        prev.next = new Node(value);
    }

    public void reverse() {
        Node prev = null;
        Node cur = head;
        while (cur != null) {
            Node nextTemp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = nextTemp;
        }
        head = prev;
    }

    public void print() {
        Node cur = head;

        while (cur != null) {
            System.out.println(cur.value);
            cur = cur.next;
        }
    }
}
