package PracticeQuestionRecursion.EasyQuestions;
// Question link : https://www.geeksforgeeks.org/recursive-programs-to-find-minimum-and-maximum-elements-of-array/
public class MinMaxElementArray {
    public static void main(String[] args) {
        int [] arr = {1, 4, 3, -5, -4, 8, 6};
        System.out.println("max : "+maxElement(arr,0));
        System.out.println("min : "+minElement(arr,0));
    }

    static int maxElement(int[] arr,int index) {
        if (arr.length -1 == index){
            return arr[index];
        }
        return Math.max(arr[index],maxElement(arr,index+1));
    }

    static int minElement(int [] arr,int index){
        if (arr.length -1 == index){
            return arr[index];
        }
        return Math.min(arr[index],minElement(arr,index+1));
    }
}
