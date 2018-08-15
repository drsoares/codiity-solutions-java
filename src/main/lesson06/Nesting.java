package lesson06;

public class Nesting {
    public static void main(String[] args) {
        Nesting nesting = new Nesting();
        System.out.println(nesting.solution("(()(())())")); //1
        System.out.println("())");
    }

    public int solution(String S) {
        char [] chars = S.toCharArray();
        int count = 0;

        for (char c : chars) {
            if (c == '(') {
                count++;
            } else {
                count--;
            }
            if (count < 0) {
                return 0;
            }
        }

        return count == 0 ? 1 : 0;
    }
}
