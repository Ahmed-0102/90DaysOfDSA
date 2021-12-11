package BasicRecursionQuestion;

public class ReverseNumber {
    public static void main(String[] args) {
        reverse(89765);
        int ans = rev2(89765);
        System.out.println(a);
        System.out.println(ans);
    }
    //Approach 1 : Here using an outside variable a to reverse a number and the reversed number will be stored in a
    static int a = 0;
    public static void reverse(int n) {
        if (n==0){
            return;
        }
        int rem = n%10;
        a = a*10 + rem;
        reverse(n/10);
    }

    //Approach 2 it uses an helper function to reverse
    public static int rev2(int n){
        int digits = (int)(Math.log10(n)) + 1;
        return helper(n,digits);
    }

    public static int helper(int n, int digits) {
        if (n%10 == n){
            return n;
        }
        int rem = n%10;
        return rem*(int)(Math.pow(10,digits-1)) + helper(n/10,digits-1);
    }
}
