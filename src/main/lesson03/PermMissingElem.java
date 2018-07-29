package lesson03;

/**
 *

 An array A consisting of N different integers is given. The array contains integers in the range [1..(N + 1)], which means that exactly one element is missing.

 Your goal is to find that missing element.

 Write a function:

 class Solution { public int solution(int[] A); }

 that, given an array A, returns the value of the missing element.

 For example, given array A such that:
 A[0] = 2
 A[1] = 3
 A[2] = 1
 A[3] = 5

 the function should return 4, as it is the missing element.

 Assume that:

 N is an integer within the range [0..100,000];
 the elements of A are all distinct;
 each element of array A is an integer within the range [1..(N + 1)].

 Complexity:

 expected worst-case time complexity is O(N);
 expected worst-case space complexity is O(1) (not counting the storage required for input arguments).

 */
class PermMissingElem {
    //run with -ea
    public static void main(String[] args) {
        PermMissingElem permMissingElem = new PermMissingElem();
        assert (permMissingElem.solution(new int [] {2,3,5,1}) == 4);
        System.out.println("Your solution works perfectly fine");
    }

    /*
    //First implementation O(N * log(N))
    private int solution(int[] A) {
        Arrays.sort(A);
        for (int i = 0; i < A.length; i++) {
            if (i + 1 != A[i]) {
                return i + 1;
            }
        }
        return A.length + 1;
    }*/

    private int solution(int [] A) {
        int number = 0;
        for (int i = 1; i <= A.length + 1; i++) {
            number += i;
        }
        for (int i = 0; i < A.length; i++) {
            number -= A[i];
        }
        return number;
    }
}
