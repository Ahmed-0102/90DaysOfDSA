package PracticeQuestionRecursion.EasyQuestions;
// Question Link : https://www.codechef.com/problems/FIBXOR01/
public class SpecialFibonacci {
    public static void main(String[] args) {
        System.out.println(fibonacci(86,77,15));
    }

    static int fibonacci(int a, int b, int n) {
        if (n == 0){
            return a;
        }
        if (n == 1){
            return b;
        }
        if (n == 2){
            return a ^ b;
        }
        return fibonacci(a,b,n%3);
    }
}
