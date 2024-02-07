import java.util.Arrays;
import java.util.Collections;

public class SmallerThanCurrentNumber {
    public static void main(String[] args) {
        int[] arr = {6,5,4,8};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(arr)));
    }


    public static int[] smallerNumbersThanCurrent(int[] nums){

        //                   BRUTE FORCE WITH O(N^2) TIME AND O(N) SPACE

//        int count = 0;
//        int k =0;
//        int[] arr = new int[nums.length];
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = 0; j < nums.length; j++) {
//                if(j != i && nums[i] > nums[j]){
//                    count++;
//                }
//            }
//            arr[k++] = count;
//            count = 0;
//        }
//        return arr;


        //                      BETTER APPROACH USING SORTING STILL NOT BEST
//
//        bubbleSort(nums); // this will sort the array in descending order
//        int count =0;
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i+1; j < nums.length; j++) {
//                if(nums[i] != nums[j]){
//                    count++;
//                }
//            }
//            nums[i] = count;
//            count = 0;
//        }
//        return nums;
//    }
//
//    static int[] bubbleSort(int[] arr) {
//
//        for (int i = 0; i < arr.length; i++) {
//            boolean isSwapped = false;
//            for (int j = 0; j < arr.length - i - 1; j++) {
//                if(arr[j] < arr[j+1]){
//                    swap(arr,j,j+1);
//                    isSwapped = true;
//                }
//            }
//            if(!isSwapped){
//                break;
//            }
//        }
//        return arr;
//    }
//
//    private static void swap(int[] arr, int i, int j) {
//        int temp = arr[i];
//        arr[i] = arr[j];
//        arr[j] = temp;
//    }


        //                     EVEN BETTER APPROACH USING A BUCKET ARRAY

        int arr[] = new int[101]; // since there were only 100 elements in the original array
        for (int i = 0; i < nums.length; i++) {
            arr[nums[i]] = arr[nums[i]] + 1;
        } // now we have the number of occurences of each element in nums stored index wise in arr
        // now we add previous values to the current index i.e add smaller values to the current index count

        for (int i = 1; i < 100; i++) {
            arr[i] += arr[i-1];
        }
        // now we have at index i of arr , total number of elements <= i

        for (int i = 0; i < nums.length; i++) {
            int pos = nums[i];
            nums[i] = pos == 0 ? 0 : arr[pos - 1];
        }
        return nums;
    }
}
