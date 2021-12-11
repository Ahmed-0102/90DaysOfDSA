package BasicRecursionQuestion;

public class sum1toN {
    public static void main(String[] args) {
        int ans = sum(4);
        System.out.println(ans);
    }
    static int sum(int n){
        if (n<=1){
            return n;
        }
        return n + sum(n-1);
    }
}
