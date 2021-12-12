package PracticeQuestionRecursion.EasyQuestions;

public class ArraySorted {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7};
        System.out.println(sorted(arr,0));
    }

    static boolean sorted(int[] arr, int index) {
        //base condition : if the index pointer has reached at last index we will return true
        if (index == arr.length-1){
            return true;
        }
        return arr[index]<arr[index+1] && sorted(arr,index+1);
    }
}