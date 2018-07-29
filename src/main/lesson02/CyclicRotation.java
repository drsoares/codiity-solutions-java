package lesson02;

import java.util.Arrays;

/**
 * An array A consisting of N integers is given. Rotation of the array means that each element is shifted right by one index, and the last element of the array is moved to the first place. For example, the rotation of array A = [3, 8, 9, 7, 6] is [6, 3, 8, 9, 7] (elements are shifted right by one index and 6 is moved to the first place).
 * <p>
 * The goal is to rotate array A K times; that is, each element of A will be shifted to the right K times.
 * <p>
 * Write a function:
 * <p>
 * class Solution { public int[] solution(int[] A, int K); }
 * <p>
 * that, given an array A consisting of N integers and an integer K, returns the array A rotated K times.
 * <p>
 * For example, given
 * A = [3, 8, 9, 7, 6]
 * K = 3
 * <p>
 * the function should return [9, 7, 6, 3, 8]. Three rotations were made:
 * [3, 8, 9, 7, 6] -> [6, 3, 8, 9, 7]
 * [6, 3, 8, 9, 7] -> [7, 6, 3, 8, 9]
 * [7, 6, 3, 8, 9] -> [9, 7, 6, 3, 8]
 * <p>
 * For another example, given
 * A = [0, 0, 0]
 * K = 1
 * <p>
 * the function should return [0, 0, 0]
 * <p>
 * Given
 * A = [1, 2, 3, 4]
 * K = 4
 * <p>
 * the function should return [1, 2, 3, 4]
 * <p>
 * Assume that:
 * <p>
 * N and K are integers within the range [0..100];
 * each element of array A is an integer within the range [−1,000..1,000].
 * <p>
 * In your solution, focus on correctness. The performance of your solution will not be the focus of the assessment.
 */
class CyclicRotation {
    //run with -ea
    public static void main(String[] args) {
        CyclicRotation solution = new CyclicRotation();
        assert (Arrays.equals(solution.solution(new int[]{3, 8, 9, 7, 6}, 3), new int[]{9, 7, 6, 3, 8}));
        assert (Arrays.equals(solution.solution(new int[]{}, 3), new int[]{}));

        System.out.println("Your solution works perfectly fine");
    }

    private int[] solution(int[] A, int K) {
        if (A.length == 0) {
            return A;
        }
        for (int i = 0; i < K; i++) {
            A = rotateOne(A);
        }
        return A;
    }

    private int[] rotateOne(int[] a) {
        int[] arr = new int[a.length];
        arr[0] = a[a.length - 1];
        System.arraycopy(a, 0, arr, 1, a.length - 1);
        return arr;
    }
}
