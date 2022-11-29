package org;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NodeTest {

    @Test
    public void nodeTest() {

        LinkedList linkedList = new LinkedList();

        linkedList.add("val1");
        linkedList.add("val2");
        linkedList.add("val3");

        linkedList.print();

        System.out.println();

        linkedList.reverse();
        linkedList.print();
    }

}