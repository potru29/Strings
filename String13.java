public class String13 {
    public static void main(String[] args) {
        String s = "book";
        String a = "";
        String b = "";
        int a_count = 0;
        int b_count = 0;
        for (int i = 0; i < s.length() / 2; i++) {
            a += s.charAt(i);
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'
                    || s.charAt(i) == 'u' ||
                    s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I' || s.charAt(i) == 'O'
                    || s.charAt(i) == 'U') {
                a_count++;
            }

        }
        for (int i = s.length() / 2; i < s.length(); i++) {
            b += s.charAt(i);
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'
                    || s.charAt(i) == 'u' ||
                    s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I' || s.charAt(i) == 'O'
                    || s.charAt(i) == 'U') {
                b_count++;
            }

        }
        System.out.println(a_count == b_count);
    }

}
