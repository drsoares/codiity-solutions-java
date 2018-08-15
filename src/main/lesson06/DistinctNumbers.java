package lesson06;

import java.util.HashSet;
import java.util.Set;

/**
 *

 Write a function

 class Solution { public int solution(int[] A); }

 that, given an array A consisting of N integers, returns the number of distinct values in array A.

 Assume that:

 N is an integer within the range [0..100,000];
 each element of array A is an integer within the range [−1,000,000..1,000,000].

 For example, given array A consisting of six elements such that:
 A[0] = 2    A[1] = 1    A[2] = 1
 A[3] = 2    A[4] = 3    A[5] = 1

 the function should return 3, because there are 3 distinct values appearing in array A, namely 1, 2 and 3.

 Complexity:

 expected worst-case time complexity is O(N*log(N));
 expected worst-case space complexity is O(N) (not counting the storage required for input arguments).


 */
class DistinctNumbers {

    public static void main(String[] args) {
        DistinctNumbers distinctNumbers = new DistinctNumbers();
        System.out.println(distinctNumbers.solution(new int[]{2, 1, 1, 2, 3, 1})); //3
    }

    private int solution(int[] A) {
        // write your code in Java SE 8
        Set<Integer> set = new HashSet<>();

        for (int a : A) {
            set.add(a);
        }

        return set.size();
    }
}
