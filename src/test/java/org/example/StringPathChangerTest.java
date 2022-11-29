package org.example;

import naver.StringPathChanger;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringPathChangerTest {
    @Test
    public void test() {
        StringPathChanger s = new StringPathChanger();
        assertEquals("/", s.changeDirectoryString("/dev/task", "cd /"));
        assertEquals("/dev", s.changeDirectoryString("/dev/task", "cd .."));
        assertEquals("/dev/task/java", s.changeDirectoryString("/dev/task", "cd java"));
        assertEquals("/dev/solution", s.changeDirectoryString("/dev/task", "cd ../solution"));
        assertEquals("/dev", s.changeDirectoryString("/dev/task/java", "cd ../.."));
        assertThrows(IllegalStateException.class, () -> s.changeDirectoryString("/dev/task/java", "wrong ../.."));
        assertEquals("/dev/task/java", s.changeDirectoryString("/dev/task", "cd java"));
        assertEquals("/dev/task/java", s.changeDirectoryString("/dev/task", "cd java/"));
        assertEquals("/dev/java", s.changeDirectoryString("/dev/task", "cd ../java"));
        assertEquals("/dev/java", s.changeDirectoryString("/dev/task", "cd ../temp/../java"));
        assertEquals("/dev/java/specific", s.changeDirectoryString("/dev/task", "cd /dev/java/specific"));
        assertEquals("/", s.changeDirectoryString("/dev/task", "cd ../.."));
        assertEquals("/", s.changeDirectoryString("/dev/task", "cd ../../.."));
        assertEquals("/", s.changeDirectoryString("/dev/task", "cd ../../../../"));
        assertEquals("/", s.changeDirectoryString("/", "cd .."));
        assertEquals("/", s.changeDirectoryString("/", "cd ../"));

    }

}