package mk;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class SolutionTest {

    Solution solution = new Solution();

    @Test
    void checkArray1() {
        int x = 10;
        int y = 85;
        int d = 30;
        int result = solution.solution(x, y, d);
        assertTrue(3 == result);
    }

    @Test
    void checkArray11() {
        int x = 10;
        int y = 85;
        int d = 30;
        int result = solution.solutionBeterPerformance(x, y, d);
        assertTrue(3 == result);
    }

    @Test
    void checkArray2() {
        int x = 1;
        int y = 1;
        int d = 1;
        int result = solution.solution(x, y, d);
        assertTrue(0 == result);
    }

    @Test
    void checkArray22() {
        int x = 1;
        int y = 1;
        int d = 1;
        int result = solution.solutionBeterPerformance(x, y, d);
        assertTrue(0 == result);
    }

    @Test
    void checkArray3() {
        int x = 10;
        int y = 100;
        int d = 10;
        int result = solution.solution(x, y, d);
        assertTrue(9 == result);
    }

    @Test
    void checkArray33() {
        int x = 10;
        int y = 100;
        int d = 10;
        int result = solution.solutionBeterPerformance(x, y, d);
        assertTrue(9 == result);
    }

}