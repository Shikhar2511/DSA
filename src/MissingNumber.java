public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {9,6,4,2,3,5,7,0,1};
        System.out.println("The missing number is : " + missingNumber(arr));

    }

    public static int missingNumber(int[] nums) {

        int i =0;
        while(i < nums.length){

            int correct = nums[i];
            if(nums[i] < nums.length && nums[correct] != nums[i]){
                swap(nums,i,correct);
            }else{
                i++;
            }
        }

        //searching for first missing number
        for (int j = 0; j < nums.length; j++) {
            if(nums[j] != j){
                return j;
            }
        }
        return nums.length;
    }

    private static void swap(int[] nums, int i, int correct) {
        int temp = nums[i];
        nums[i] = nums[correct];
        nums[correct]= temp;
    }
}
