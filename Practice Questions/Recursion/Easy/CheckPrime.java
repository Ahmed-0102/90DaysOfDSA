package PracticeQuestionRecursion.EasyQuestions;
// Question Link : https://www.geeksforgeeks.org/recursive-program-prime-number/
public class CheckPrime {
    public static void main(String[] args) {
        System.out.println(isPrime(23,2));
    }

    static boolean isPrime(int n,int i) {
        if (n<=2){
            return (n==2)?true:false;
        }
        if (n%i==0){
            return false;
        }
        if (i*i > n){
            return false;
        }
        return isPrime(n,i+1);
    }
}
