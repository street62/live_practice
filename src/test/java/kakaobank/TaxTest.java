package kakaobank;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaxTest {
    @Test
    public void taxTest() {
        Tax t = new Tax();
//        assertEquals(9000014, t.solution(12345678, 10, 20, 250000, 10000000, 4));
//        assertEquals(6150, t.solution(1000000000, 50  , 99, 100000, 0, 6));
        assertEquals(123456789, t.solution(123456789, 0  , 0, 1, 0, 360));
    }

}