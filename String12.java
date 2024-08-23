public class String12 {
    public static void main(String[] args) {
        String word1[] = { "a", "bc" };
        String word2[] = { "ab", "cd" };
        String ans1 = "";
        String ans2 = "";
        for (int i = 0; i < word1.length; i++) {
            ans1 += word1[i];
        }
        for (int j = 0; j < word2.length; j++) {
            ans2 += word2[j];

        }
        System.out.println(ans1.equals(ans2));

    }
}
