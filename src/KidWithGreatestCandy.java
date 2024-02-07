import java.util.ArrayList;
import java.util.List;

public class KidWithGreatestCandy {
    public static void main(String[] args) {
        int[] arr = {12,1,12};
        System.out.println(kidsWithCandies(arr,10));
    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> list = new ArrayList<>();

        int max = 0;
        // to find the kid with most amount of candies
        for (int i = 0; i < candies.length; i++) {
            if(max < candies[i]){
                max = candies[i];
            }
        }

        for (int i = 0; i < candies.length; i++) {
            if(candies[i] + extraCandies >= max){
                list.add(true);
            }else{
                list.add(false);
            }
        }
        return list;
    }
}
