package org;

public class HashTable {
    private static class Node {
        private String key;
        private String value;
        private Node nextInSameIndex;
        private Node before;

        private Node after;

        public Node(String key, String value) {
            this.key = key;
            this.value = value;
        }
    }

    private final Node[] bucket;
    private final int bucketSize;
    private final Node head = new Node("dummy", "dummyValue");
    private Node tail = head;

    public HashTable(int bucketSize) {
        this.bucket = new Node[bucketSize];
        this.bucketSize = bucketSize;
    }

    public void put(String key, String value) {
        int bucketIdx = key.hashCode() % bucketSize;
        Node curNode = bucket[bucketIdx];

        if (curNode == null) {
            bucket[bucketIdx] = new Node(key, value);
            bucket[bucketIdx].before = tail;
            tail.after = bucket[bucketIdx];
            tail = tail.after;
            return;
        }
        Node prevNode = null;
        while(curNode != null) {
            if (curNode.key.equals(key)) {
                curNode.value = value;
                curNode.before.after = curNode.after;

                if (curNode.after != null) {
                    curNode.after.before = curNode.before;
                }

                curNode.before = tail;
                curNode.after = null;
                tail.after = curNode;
                tail = tail.after;
                return;
            }
            prevNode = curNode;
            curNode = curNode.nextInSameIndex;
        }
        prevNode.nextInSameIndex = new Node(key, value);
        prevNode.nextInSameIndex.before = tail;
        tail.after = prevNode.nextInSameIndex;
        tail = tail.after;
    }

    public String get(String key) {
        int bucketIdx = key.hashCode() % bucketSize;

        Node curNode = bucket[bucketIdx];

        while (curNode != null) {
            if (curNode.key.equals(key)) {
                return curNode.value;
            }
            curNode = curNode.nextInSameIndex;
        }
        return null;
    }

    public void printNodes() {
        Node cur = head.after;
        while (cur != null) {
            System.out.printf("%s - %s\n", cur.key, cur.value);
            cur = cur.after;
        }
    }
}
