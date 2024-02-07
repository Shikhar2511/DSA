import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class test {
    public static void main(String[] args) {
        String name1 = "";
        String name2 = "y";
        char ans = 0 ;

        char[] arr1 = name1.toCharArray();
        char[] arr2 = name2.toCharArray();

        for (char cs : arr1) {
            ans ^= cs;   // Whenever I am writing ans = ans ^ cs I am getting an error
        }
        for (char ct : arr2) {
            ans ^= ct;
        }
//        System.out.println(ans);
//        System.out.println(findTheDifference(name1,name2));
        System.out.println((testing()));

    }

    public static char findTheDifference(String s, String t) {
        char[] cs = s.toCharArray();
        char[] ct = t.toCharArray();

        if(cs.length == 0){
            return ct[0];
        }
        char c = cs[0];
        for (int i = 1; i < s.length(); i++) {
            c ^= cs[i];
        }
        for (int i = 0; i < t.length(); i++) {
            c ^= ct[i];
        }

        return c;
    }

    static List<Integer> testing(){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        return list;
    }
}
