import java.util.Scanner;

public class String5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            String names = sc.next();
            sb.append(names);

        }
        System.out.println(sb.length());

    }

}
