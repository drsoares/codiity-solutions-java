package lesson03;

import java.math.BigDecimal;

/**
 * A small frog wants to get to the other side of the road. The frog is currently located at position X and wants to get to a position greater than or equal to Y. The small frog always jumps a fixed distance, D.
 * <p>
 * Count the minimal number of jumps that the small frog must perform to reach its target.
 * <p>
 * Write a function:
 * <p>
 * class Solution { public int solution(int X, int Y, int D); }
 * <p>
 * that, given three integers X, Y and D, returns the minimal number of jumps from position X to a position equal to or greater than Y.
 * <p>
 * For example, given:
 * X = 10
 * Y = 85
 * D = 30
 * <p>
 * the function should return 3, because the frog will be positioned as follows:
 * <p>
 * after the first jump, at position 10 + 30 = 40
 * after the second jump, at position 10 + 30 + 30 = 70
 * after the third jump, at position 10 + 30 + 30 + 30 = 100
 * <p>
 * Assume that:
 * <p>
 * X, Y and D are integers within the range [1..1,000,000,000];
 * X ≤ Y.
 * <p>
 * Complexity:
 * <p>
 * expected worst-case time complexity is O(1);
 * expected worst-case space complexity is O(1).
 */
public class FrogJmp {
    //run with -ea
    public static void main(String[] args) {
        FrogJmp frogJmp = new FrogJmp();
        assert (frogJmp.solution(10, 85, 30) == 3);
        System.out.println("Your solution works perfectly fine");
    }

    private int solution(int X, int Y, int D) {
        return new BigDecimal(Y - X).divide(new BigDecimal(D), BigDecimal.ROUND_UP).intValue();
    }
}
