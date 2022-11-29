package org;

import naver.FindNumber;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class FindNumberTest {

    @Test
    public void one() {
        FindNumber n = new FindNumber();

        assertEquals(5268, n.solution(268));
        assertEquals(556, n.solution(56));
        assertEquals(54321, n.solution(554321));
        assertEquals(9875, n.solution(987));
        assertEquals(6750, n.solution(670));
        assertEquals(50, n.solution(0));
        assertEquals(-5999, n.solution(-999));
        assertEquals(-15, n.solution(-1));
        assertEquals(9875, n.solution(987));
        assertEquals(-123455, n.solution(-12345));
    }

}