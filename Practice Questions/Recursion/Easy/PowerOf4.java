package PracticeQuestionRecursion.EasyQuestions;
// Question Link : https://leetcode.com/problems/power-of-four/
public class PowerOf4 {
    public static void main(String[] args) {
        System.out.println(power(1));
    }

    static boolean power(int n) {
        if (n<=1){
            return (n==1);
        }
//        if (n == 1){
//            return true;
//        }
        return n%4==0 && power(n/4);
    }
}
