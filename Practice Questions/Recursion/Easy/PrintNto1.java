package PracticeQuestionRecursion.EasyQuestions;

public class PrintNto1 {
    public static void main(String[] args) {
        printNumbers(8);
    }

    static void printNumbers(int n) {
        if (n == 0){
            return;
        }
        System.out.println(n);
        printNumbers(n-1);
    }
}
