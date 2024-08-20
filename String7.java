public class String7 {
    public static void main(String[] args) {
        String s = "zaz";
        int sum = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            int val = Math.abs(s.charAt(i) - s.charAt(i + 1));
            sum = sum + val;

        }
        System.out.println(sum);

    }
}
