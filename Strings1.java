import java.util.*;

public class Strings1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String names[] = new String[n];
        for (int i = 0; i < n; i++) {
            names[i] = sc.next();
        }
        int toLength = 0;
        for (int i = 0; i < n; i++) {
            toLength += names[i].length();

        }
        System.out.println(toLength);

    }
}