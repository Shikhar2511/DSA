public class SentenceIsPangram {
    public static void main(String[] args) {
        String name = "leetcode";
        System.out.println(checkIfPangram(name));
    }

    public static boolean checkIfPangram(String sentence) {
        String all = "abcdefghijklmnopqrstuvwxyz";
        boolean isPangram = true;

        for (int i = 0; i < all.length(); i++) {
            if (sentence.indexOf(all.charAt(i)) == -1) {
                isPangram = false;
            }
            if (!isPangram) {
                return isPangram;
            }
        }
        return isPangram;
    }
}
