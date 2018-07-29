package lesson03;

/**
 * An array A consisting of N different integers is given. The array contains integers in the range [1..(N + 1)], which means that exactly one element is missing.
 * <p>
 * Your goal is to find that missing element.
 * <p>
 * Write a function:
 * <p>
 * class Solution { public int solution(int[] A); }
 * <p>
 * that, given an array A, returns the value of the missing element.
 * <p>
 * For example, given array A such that:
 * A[0] = 2
 * A[1] = 3
 * A[2] = 1
 * A[3] = 5
 * <p>
 * the function should return 4, as it is the missing element.
 * <p>
 * Assume that:
 * <p>
 * N is an integer within the range [0..100,000];
 * the elements of A are all distinct;
 * each element of array A is an integer within the range [1..(N + 1)].
 * <p>
 * Complexity:
 * <p>
 * expected worst-case time complexity is O(N);
 * expected worst-case space complexity is O(1) (not counting the storage required for input arguments).
 */
class PermMissingElem {
    //run with -ea
    public static void main(String[] args) {
        PermMissingElem permMissingElem = new PermMissingElem();
        assert (permMissingElem.solution(new int[]{2, 3, 5, 1}) == 4);
        System.out.println("Your solution works perfectly fine");
    }

    /**
     * This solution also scores 100%, yet its O(N * Log(N))
     *
     * private int solution(int[] A) {
     *  Arrays.sort(A);
     *  for (int i = 0; i < A.length; i++) {
     *   if (i + 1 != A[i]) {
     *    return i + 1;
     *   }
     *  }
     *  return A.length + 1;
     * }
     */

    private int solution(int[] A) {
        long N = A.length + 1;
        long number = (N * (N + 1)) / 2;
        long sum = 0L;
        for (int a : A) {
            sum += a;
        }
        return (int) (number - sum);
    }
}
