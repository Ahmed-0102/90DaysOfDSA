package PracticeQuestionRecursion.EasyQuestions;
// Question Link : https://leetcode.com/problems/power-of-two/
public class PowerOf2 {
    public static void main(String[] args) {
        System.out.println(power(16));
    }

    static boolean power(int n) {
        if (n<=1){
            return (n==1);
        }
        return n%2==0 && power(n/2);
    }
}
