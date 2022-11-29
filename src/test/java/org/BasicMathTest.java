package org;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BasicMathTest {
    @Test
    public void getPrimesLessOrEqualToTest() {
        List<Integer> primes = BasicMath.getPrimesLessOrEqualTo(11);
        Assertions.assertEquals(5, primes.size());
    }

    @Test
    public void getGcdAndLcmTest() {
        int[] res = BasicMath.getGcdAndLcm(12, 15);
        Assertions.assertEquals(3, res[0]);
        Assertions.assertEquals(60, res[1]);
    }
}