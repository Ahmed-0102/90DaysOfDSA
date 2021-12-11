package PracticeQuestionRecursion.EasyQuestions;
// Question Link : https://leetcode.com/problems/fibonacci-number/
public class FibonacciNumbers {
    public static void main(String[] args) {
        System.out.println(fibo(3));
    }

    static int fibo(int n) {
        if (n<=1){
            return n;
        }
        return fibo(n-1)+fibo(n-2);
    }

}
