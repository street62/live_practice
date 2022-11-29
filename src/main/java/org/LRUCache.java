package org;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {
    private static class Node {
        private String key;
        private String value;
        private Node before;
        private Node after;

        public Node(String key, String value) {
            this.key = key;
            this.value = value;
        }
    }

    private Map<String, Node> cache = new HashMap<>();
    private Node head = new Node("dummy", "dummyValue");
    private Node tail = head;
    private final int maxSize;
    private int curSize;

    public LRUCache(int maxSize) {
        this.maxSize = maxSize;
    }

    public String get(String key) {
        Node node = cache.get(key);
        if (node == null) {
            return null;
        }
        updateAsLastUsed(node);
        return cache.get(key).value;
    }

    public void put(String key, String value) {
        if (cache.containsKey(key)) {
            Node node = cache.get(key);
            node.value = value;
            updateAsLastUsed(node);
            return;
        }

        Node node = new Node(key, value);
        cache.put(key, node);

        if (curSize == maxSize) {
            cache.remove(head.after.key);
            head.after = head.after.after;
            curSize -= 1;
        }
        tail.after = node;
        node.before = tail;
        tail = tail.after;
        curSize += 1;
    }

    private void updateAsLastUsed(Node node) {
        node.before.after = node.after;
        if (node.after != null) {
            node.after.before = node.before;
        }
        tail.after = node;
        node.before = tail;
        tail = tail.after;
    }
}
