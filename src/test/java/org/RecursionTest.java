package org;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class RecursionTest {
    @Test
    public void getAllBinariesTest() {
        Assertions.assertEquals(Set.of("0", "1"), Recursion.getAllBinaries(1));
        Assertions.assertEquals(Set.of("00", "01", "10", "11"), Recursion.getAllBinaries(2));
        Assertions.assertEquals(Set.of("000", "001", "010", "011", "100", "101", "110", "111"), Recursion.getAllBinaries(3));
        Assertions.assertEquals(4096, Recursion.getAllBinaries(12).size());


    }
}