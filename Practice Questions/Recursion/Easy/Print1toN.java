package PracticeQuestionRecursion.EasyQuestions;

public class Print1toN {
    public static void main(String[] args) {
        printNumber(5);
    }

    static void printNumber(int n) {
        if (n == 0){
            return;
        }
        printNumber(n-1);
        System.out.println(n);
    }

}
