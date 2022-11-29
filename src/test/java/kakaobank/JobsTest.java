package kakaobank;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class JobsTest {
    @Test
    public void jobsTest() {
//        int[] solution = new Jobs().solution(new int[][]{{1, 5, 2, 3}, {2, 2, 3, 2}, {3, 1, 3, 3}, {5, 2, 1, 5}, {7, 1, 1, 1}, {9, 1, 1, 1}, {10, 2, 2, 9}});
//        int[] solution = new Jobs().solution(new int[][]{{1,2,1,5}, {2,1,2,100}, {3,2,1,5}, {5,2,1,5}});
//        int[] solution = new Jobs().solution(new int[][]{{2,5,1,3}, {1,1,1,1}, {1,1,1,1}, {1,1,1,1}});
//        int[] solution = new Jobs().solution(new int[][]{{2,5,1,3}, {10,1,2,1}, {15,1,1,1}, {17,1,1,1}});
//        int[] solution = new Jobs().solution(new int[][]{{2,5,2,3}, {2,4,1,10}, {15,1,1,1}, {17,1,1,1}});
//        int[] solution = new Jobs().solution(new int[][]{{2,5,3,3}, {2,4,1,10}, {6,1,2,10}, {10,1,2,1}});

//        int[] solution = new Jobs().solution(new int[][]{{2,5,3,3}, {2,4,1,10}, {6,1,1,10}, {6,3,2,4}, {11, 1, 9, 10}});
//        int[] solution = new Jobs().solution(new int[][]{{2,5,3,3}, {8,3,2,4}, {9,4,1,10}, {10, 1, 9, 10}, {11,1,5,11}});
//        int[] solution = new Jobs().solution(new int[][]{{1,10,1,4}, {2,3,3,5}, {3,4,2,5}, {4,7,8,10}});
//        int[] solution = new Jobs().solution(new int[][]{{1,10,1,1}, {2,2,2,1}, {3,2,3,1}, {4,1,4,1}});
//        int[] solution = new Jobs().solution(new int[][]{{1,10,1,1}, {2,2,2,1}, {3,2,3,1}, {4,1,4,10}});
//        int[] solution = new Jobs().solution(new int[][]{{1,10,1,1}, {2,2,2,1}, {3,2,3,1}, {4,1,4,1}, {14,1,2,1}});
        int[] solution = new Jobs().solution(new int[][]{{1,15,1,1}, {2,2,2,1}, {12,2,3,10}, {13,1,4,11}, {17,1,3,7}});


        System.out.println(Arrays.toString(solution));
    }

}