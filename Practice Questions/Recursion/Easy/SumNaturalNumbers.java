package PracticeQuestionRecursion.EasyQuestions;
// Question Link : https://www.geeksforgeeks.org/sum-of-natural-numbers-using-recursion/
public class SumNaturalNumbers {
    public static void main(String[] args) {
        System.out.println(sum(6));
    }

    static int sum(int n) {
        if (n<=1){
            return n;
        }
        return n+sum(n-1);
    }
}
