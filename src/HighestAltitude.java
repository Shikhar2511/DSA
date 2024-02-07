import java.util.List;

public class HighestAltitude {
    public static void main(String[] args) {
        int[] arr = {-4,-3,-2,-1,4,3,2};
        System.out.println(largestAltitude(arr));
    }
    public static int largestAltitude(int[] gain) {
        int maxAlt =0;
        int currentAlt = 0;

        for (int i = 0; i < gain.length; i++) {
            if(maxAlt < currentAlt){
                maxAlt = currentAlt;
            }
            currentAlt += gain[i];
        }
        return maxAlt;
    }
}
