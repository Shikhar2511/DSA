// Here we use bit manipulation , since the constraint in the question mentions that the numbers in the a
//array only range from 1 to  1000 => 2^10 - 1 = 1023 bits but as we know any integer number takes 10bits  => 22 bits will remain
//empty . We use this information and shift the 'x' towards the left by 10 bits to make space for 'y'


import java.util.Arrays;

public class ShuffleArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,4,3,2,1};
        System.out.println(Arrays.toString(shuffle(arr,4)));
    }
    public static int[] shuffle(int[] nums, int n) {

        // now since y has been shifted 10 bits to the left , we add 'x' to it by the logical OR operation
        // Now  'xy' exists within the space where y was initially
        // this xy is stored as x1 and y1 together at the place of x1
        for(int i = 0; i < nums.length/2; i++) {
            nums[i] = (nums[i] << 10) | nums[i + n];
        }

        int index = 2 * n - 1;
        // Extracting 'y' from 'xy'
        for(int i = n-1; i >= 0; i--, index -= 2) {
            nums[index] = nums[i] & 1023;
            nums[index - 1] = nums[i] >> 10;
        }
        return nums;
    }
}
