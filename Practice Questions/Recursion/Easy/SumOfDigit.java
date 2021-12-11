package PracticeQuestionRecursion.EasyQuestions;

public class SumOfDigit {
    public static void main(String[] args) {
        System.out.println(digitSum(123456));
    }

    static int digitSum(int n) {
        if(n==0){
            return 0;
        }
        return (n%10)+digitSum(n/10);
    }
}
