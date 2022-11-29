package org;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {
    @Test
    public void stackTest() {
        Stack stack = new Stack(5);

        Assertions.assertTrue(stack.push(1));
        Assertions.assertTrue(stack.push(2));
        Assertions.assertTrue(stack.push(3));
        Assertions.assertTrue(stack.push(4));
        Assertions.assertTrue(stack.push(5));

        Assertions.assertFalse(stack.push(6));

        Assertions.assertEquals(5, stack.pop());
        Assertions.assertEquals(4, stack.pop());
        Assertions.assertEquals(3, stack.pop());
        Assertions.assertEquals(2, stack.pop());
        Assertions.assertEquals(1, stack.pop());
    }

}