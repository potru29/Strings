import java.util.*;

public class String6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        StringBuilder sb = new StringBuilder(word);

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == '@') {
                sb.delete(i, word.length());

            }

        }
        System.out.println(sb);

    }

}
