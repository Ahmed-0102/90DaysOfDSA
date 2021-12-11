package BasicRecursionQuestion;

public class CountZeros {
    public static void main(String[] args) {
        int ans = count(308870);
        System.out.println(ans);
    }

    public static int count(int n) {
        return helper(n,0);
    }
    public static int helper(int n,int counts){
        if (n==0){
            return counts;
        }
        int rem = n%10;
        if (rem == 0){
            return helper(n/10,counts+1);
        }
        return helper(n/10,counts);
    }
}
