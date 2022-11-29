package org;

import java.util.EmptyStackException;

public class Stack {
    private final int[] stack;
    private final int maxSize;
    private int currentSize;

    public Stack(int maxSize) {
        this.stack = new int[maxSize];
        this.maxSize = maxSize;
    }

    public boolean push(int value) {
        if (currentSize == maxSize) {
            return false;
        }
        stack[currentSize] = value;
        currentSize += 1;
        return true;
    }

    public int pop() {
        if (currentSize == 0) {
            throw new EmptyStackException();
        }
        return stack[--currentSize];
    }
}
