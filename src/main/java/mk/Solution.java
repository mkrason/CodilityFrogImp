package mk;

public class Solution {

    public int solution(int x, int y, int d) {

        int counter = 0;

        for (int i = x; i < y; i = i + d) {
            counter++;
        }
        return counter;
    }

}
