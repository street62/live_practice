package org;

import naver.Log;
import org.junit.jupiter.api.Test;

class LogTest {
    @Test
    public void test() {
        Log log = new Log();
        log.solution("2019/05/01 00:59:19" +
                "2019/06/01 01:35:20\n" +
                "2019/08/01 24:01:22\n" +
                "2019/08/01 02:01:23\n" +
                "2019/08/02 03:02:35\n" +
                "2019/10/03 04:05:40\n" +
                "2019/10/04 06:23:10\n" +
                "2019/10/01 08:23:20\n" +
                "2019/10/01 08:42:24\n" +
                "2019/10/01 08:43:26\n" +
                "2019/11/01 08:43:29\n" +
                "2019/11/01 10:19:02\n" +
                "2019/12/01 11:23:10\n");
    }
}