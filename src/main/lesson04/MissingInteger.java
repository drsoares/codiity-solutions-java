package lesson04;

import java.util.HashSet;
import java.util.Set;

/**
 * This is a demo task.
 * <p>
 * Write a function:
 * <p>
 * class Solution { public int solution(int[] A); }
 * <p>
 * that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.
 * <p>
 * For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.
 * <p>
 * Given A = [1, 2, 3], the function should return 4.
 * <p>
 * Given A = [−1, −3], the function should return 1.
 * <p>
 * Assume that:
 * <p>
 * N is an integer within the range [1..100,000];
 * each element of array A is an integer within the range [−1,000,000..1,000,000].
 * <p>
 * Complexity:
 * <p>
 * expected worst-case time complexity is O(N);
 * expected worst-case space complexity is O(N) (not counting the storage required for input arguments).
 */
class MissingInteger {
    //run with -ea
    public static void main(String[] args) {
        MissingInteger missingInteger = new MissingInteger();
        assert (missingInteger.solution(new int[]{-1, -2}) == 1);
        assert (missingInteger.solution(new int[]{1, 2, 3}) == 4);
        System.out.println("Your solution works perfectly fine");
    }

    private int solution(int[] A) {
        Set<Integer> set = new HashSet<>(A.length);
        for (int a : A) {
            set.add(a);
        }

        for (int i = 1; i <= 1000000; i++) {
            if (!set.contains(i)) {
                return i;
            }
        }

        return 1000001;
    }
}
