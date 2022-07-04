import java.util.Scanner;

public class task32 {
    public static void main(String[] args) {
        int x;
        Scanner scanner = new Scanner(System.in);
        x = scanner.nextInt();


        for (int c = 10; c > 9 && c < 100; c++) {
            int a, b;
            a = c % 10;
            b = c / 10;
            if (a + b == x) {
                System.out.println(c);
            }
        }
    }
}
