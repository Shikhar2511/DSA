import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {2,2,1,1,1,2,2};
        System.out.println(Arrays.toString(bubbleSort(arr)));
    }

     static int[] bubbleSort(int[] arr) {

         for (int i = 0; i < arr.length; i++) {
             boolean isSwapped = false;
             for (int j = 0; j < arr.length - i - 1; j++) {
                 if(arr[j] > arr[j+1]){
                     swap(arr,j,j+1);
                     isSwapped = true;
                 }
             }
             if(!isSwapped){
                 break;
             }
         }
         return arr;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
