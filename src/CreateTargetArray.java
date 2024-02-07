import java.util.ArrayList;
import java.util.Arrays;

public class CreateTargetArray {
    public static void main(String[] args) {
        int[] nums = {7,6,5,5,5,4,5,5};
        int[] index = {0,1,1,2,4,2,3,6};
        System.out.println(Arrays.toString(createTargetArray(nums,index)));
    }
    public static int[] createTargetArray(int[] nums, int[] index) {

        //               NOT THE BEST SOLUTION USING A BUCKET ARRAY OF BOOLEAN TYPE TO MARK THE INDEXES WHICH HAVE BEEN VISITED

//        boolean[] arr = new boolean[nums.length];
//        int[] target = new int[nums.length];
//
//        for (int i = 0; i < nums.length; i++) {
//            if( !arr[index[i]] ){
//                arr[index[i]] = true;
//                target[index[i]] = nums[i];
//            }else{
//                for (int j = nums.length - 1; j >= (index[i] + 1); j--) {
//                    target[j] = target[j-1];
//                }
//                target[index[i]] = nums[i];
//                arr[i] = true;
//            }
//        }
//        return target;

        //                                          BETTER APPROACH USING ARRAYLIST

        ArrayList<Integer> list = new ArrayList<>();
        int[] target = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            list.add(index[i],nums[i]);
        }
        for (int i = 0; i < nums.length; i++) {
            target[i] = list.get(i);
        }
        return target;
    }
}
