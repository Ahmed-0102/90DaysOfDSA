package PracticeQuestionRecursion.EasyQuestions;

public class PowerOf3 {
    public static void main(String[] args) {
        System.out.println(power(2));
    }

    static boolean power(int n) {
        if (n<=1){
            return (n==1);
        }
        return n%3==0 && power(n/3);
    }
}
