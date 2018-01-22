package mk;

public class Solution {

    public int solution(int x, int y, int d) {

        int counter = 0;

        for (int i = x; i < y; i = i + d) {
            counter++;
        }
        return counter;
    }

    public int solutionBeterPerformance(int x, int y, int d) {

        int howLong = y - x;
        int jumps = howLong / d;
        int myResult = 0;

        if (howLong == 0) {
        } else if (howLong % d == 0) {
            myResult = jumps;
        } else {
            myResult = jumps + 1;
        }

        return myResult;
    }

}
