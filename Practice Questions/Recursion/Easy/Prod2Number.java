package PracticeQuestionRecursion.EasyQuestions;
// Question Link : https://www.geeksforgeeks.org/product-2-numbers-using-recursion/
public class Prod2Number {
    public static void main(String[] args) {
        System.out.println(product(5,10));
    }

    static int product(int x, int y) {
        if (x<y){
            return product(y,x);
        } else if (y!=0){
            return (x+product(x,y-1));
        } else {
            return 0;
        }
    }
}
