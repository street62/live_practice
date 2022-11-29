package org;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Recursion {
    public static Set<String> getAllBinaries(int numOfBits) {
        if (numOfBits == 1) {
            return new HashSet<>(List.of("0", "1"));
        }
        Set<String> res = new HashSet<>();
        Set<String> prev = getAllBinaries(numOfBits - 1);
        for (String s : prev) {
            res.add("0" + s);
            res.add("1" + s);
        }
        return res;
    }
}
