public class String10 {
    public static void main(String[] args) {
        String s = "()[]{";
        while (s.contains("()") || s.contains("[]") || s.contains("{}")) {
            s = s.replace("()", "").replace("[]", "").replace("{}", "");

        }
        System.out.println(s.isEmpty());

    }
}
