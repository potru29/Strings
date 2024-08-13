import java.util.*;

public class String2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        String result = "";
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == 'e') {
                result += 'i';

            } else {
                result += word.charAt(i);
            }
        }
        System.out.println(result);

    }
}
