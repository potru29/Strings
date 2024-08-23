public class String14 {
    public static void main(String[] args) {
        String[] s = { "alice and bob love leetcode", "i think so too", "this is great thanks very much" };
        int ans = 0;
        for (int i = 0; i < s.length; i++) {
            String str = s[i];
            int temp = 1;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == ' ') {
                    temp++;

                }

            }

            ans = Math.max(temp, ans);

        }
        System.out.println(ans);

    }

}
