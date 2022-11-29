package kakaobank;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DoorTest {

    @Test
    public void doorTest() {
//        Door door = new Door();
        assertEquals(1, new Door().solution(new int[] {3, 1, 2, 4}));
        assertEquals(1, new Door().solution(new int[] {2, 3, 4, 5, 1}));
        assertEquals(5, new Door().solution(new int[] {1, 2, 3, 4, 5, 6}));
    }

}