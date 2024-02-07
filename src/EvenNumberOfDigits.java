public class EvenNumberOfDigits {
    public static void main(String[] args) {
        int[] arr = {12,345,2,6,7896};
        System.out.println(findNumbers(arr));
    }
    public static int findNumbers(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] > 9 && nums[i] < 100 || nums[i] > 999 && nums[i] < 10000 || nums[i] == 100000){
                count++;
            }
        }
        return count;
    }
}
