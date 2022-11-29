package org;

public class Q {
    private final int[] q;
    private final int maxSize;
    private int curSize;
    private int left;
    private int right;

    public Q (int maxSize) {
        this.maxSize = maxSize;
        this.q = new int[maxSize];
    }

    public boolean add(int value) {
        if (curSize == maxSize) {
            return false;
        }
        q[right] = value;
        right = (right + 1) % maxSize;
        curSize += 1;
        return true;
    }

    public int poll() {
        if (curSize == 0) {
            throw new IndexOutOfBoundsException();
        }
        curSize -= 1;
        int value = q[left];
        left = (left + 1) % maxSize;
        return value;
    }
}
