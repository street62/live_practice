package org;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QTest {
    @Test
    public void qTest() {
        Q q = new Q(5);

        Assertions.assertTrue(q.add(1));
        Assertions.assertTrue(q.add(2));
        Assertions.assertTrue(q.add(3));
        Assertions.assertTrue(q.add(4));
        Assertions.assertTrue(q.add(5));

        Assertions.assertFalse(q.add(6));

        Assertions.assertEquals(1, q.poll());
        Assertions.assertEquals(2, q.poll());

        Assertions.assertTrue(q.add(6));
        Assertions.assertTrue(q.add(7));

        Assertions.assertFalse(q.add(8));

        Assertions.assertEquals(3, q.poll());
        Assertions.assertEquals(4, q.poll());
        Assertions.assertEquals(5, q.poll());
        Assertions.assertEquals(6, q.poll());
        Assertions.assertEquals(7, q.poll());
    }

}