public class RichestCustomerWealth {
    public static void main(String[] args) {
        int max = Integer.MIN_VALUE;
        int[][] arr = {
        };
        System.out.println(maximumWealth(arr));


    }
    public static int maximumWealth(int[][] accounts) {
        int temp = 0;
        int check = 0;

        for (int i = 0; i < accounts.length; i++) {
            temp = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                temp += accounts[i][j];
            }
            if(check < temp){
                check = temp;
            }
        }
        return check;
    }
}
