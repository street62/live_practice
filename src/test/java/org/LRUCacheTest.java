package org;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LRUCacheTest {
    @Test
    public void cacheTest() {
        LRUCache cache = new LRUCache(3);

        cache.put("key1", "value1");
        cache.put("key2", "value2");
        cache.put("key3", "value3");
        cache.put("key4", "value4");

        Assertions.assertEquals(null, cache.get("key1"));
        Assertions.assertEquals("value4", cache.get("key4"));
    }
}
