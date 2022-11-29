package org;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HashTableTest {

    @Test
    public void hashTableTest() {
        HashTable table = new HashTable(3);

        table.put("key1", "value1");
        table.put("key2", "value2");
        table.put("key3", "value3");
        table.put("key4", "value4");
        table.put("key5", "value5");
        table.put("key4", "newValue4");

        Assertions.assertEquals("value1", table.get("key1"));
        Assertions.assertEquals("value2", table.get("key2"));
        Assertions.assertEquals("value3", table.get("key3"));
        Assertions.assertEquals("newValue4", table.get("key4"));
        Assertions.assertEquals("value5", table.get("key5"));

        table.printNodes();
    }

}