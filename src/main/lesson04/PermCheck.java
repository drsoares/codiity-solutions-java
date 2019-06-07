package lesson04;

/**
 *

 A non-empty array A consisting of N integers is given.

 A permutation is a sequence containing each element from 1 to N once, and only once.

 For example, array A such that:
 A[0] = 4
 A[1] = 1
 A[2] = 3
 A[3] = 2

 is a permutation, but array A such that:
 A[0] = 4
 A[1] = 1
 A[2] = 3

 is not a permutation, because value 2 is missing.

 The goal is to check whether array A is a permutation.

 Write a function:

 class Solution { public int solution(int[] A); }

 that, given an array A, returns 1 if array A is a permutation and 0 if it is not.

 For example, given array A such that:
 A[0] = 4
 A[1] = 1
 A[2] = 3
 A[3] = 2

 the function should return 1.

 Given array A such that:
 A[0] = 4
 A[1] = 1
 A[2] = 3

 the function should return 0.

 Assume that:

 N is an integer within the range [1..100,000];
 each element of array A is an integer within the range [1..1,000,000,000].

 Complexity:

 expected worst-case time complexity is O(N);
 expected worst-case space complexity is O(N) (not counting the storage required for input arguments).

 */
class PermCheck {
    //run with -ea
    public static void main(String[] args) {
        PermCheck permCheck = new PermCheck();
        assert (permCheck.solution(new int[]{4,1,3,2}) == 1);
        assert (permCheck.solution(new int[]{4,1,3}) == 0) ;
        System.out.println("Your solution works perfectly fine");
    }

    private int solution(int[] A) {
        int aux = 0;
        for (int i = 0; i < A.length; i++) {
            aux ^= i + 1;
            aux ^= A[i];
        }
        if (aux != 0) {
            return 0;
        } else {
            return 1;
        }
    }

    /**
     * Works even though its O(N*log(N))
     *
     * private int solution(int[] A) {
     *         Arrays.sort(A);
     *         for (int i = 0; i < A.length; i++) {
     *             if (A[i] != i + 1) {
     *                 return 0;
     *             }
     *         }
     *         return 1;
     *     }
     *
     * It gets 80% yet i didn't figure out whats the issue with this one
     *
     * private int solution(int[] A) {
     *  Set<Integer> set = new HashSet<>();
     *  long sum = 0L;
     *  int max = 0;
     *  for (int i = 0; i < A.length; i++) {
     *   max = Math.max(max, A[i]);
     *   if (set.add(A[i])) {
     *    sum += A[i];
     *   } else {
     *    return 0;
     *   }
     *  }
     *
     *  long expectedSum = (max * (max + 1)) / 2;
     *
     *  if (sum == expectedSum) {
     *   return 1;
     *  } else {
     *   return 0;
     *  }
     * }
     */

}
