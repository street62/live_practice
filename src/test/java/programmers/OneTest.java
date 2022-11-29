package programmers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OneTest {

    @Test
    void test() {
        One one = new One();
        String[] input = new String[] {".########......", ".####...#......", ".#.####.#.#####", ".#.#..#.#.#..##", ".#.##.#.#.#...#", ".#.####.#.#...#", ".#....###.#####", ".########......"};
        assertEquals(2, one.solution(25, 51, input));
    }

}