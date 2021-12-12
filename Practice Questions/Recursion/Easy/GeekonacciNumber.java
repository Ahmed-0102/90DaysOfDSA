package PracticeQuestionRecursion.EasyQuestions;
// Question Link : https://practice.geeksforgeeks.org/problems/geek-onacci-number/0/
public class GeekonacciNumber {
    public static void main(String[] args) {
        System.out.println(geekNumber(1,3,2,6));
    }

    static int geekNumber(int a, int b, int c, int n) {
        if (n==0){
            return a;
        }
        if (n==1){
            return b;
        }
        if (n==2){
            return c;
        }
        return geekNumber(a,b,c,n-1)+geekNumber(a,b,c,n-2)+geekNumber(a,b,c,n-3);
    }
}
