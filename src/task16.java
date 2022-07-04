import java.util.Scanner;

public class task16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x, a, b, c;
        x = scanner.nextInt();
        a = x % 10;
        b = x / 10 % 10;
        c = x / 100;

        if (b<a && b<c) {
            System.out.println("Яма");
        } else {
            System.out.println("Не Яма");
        }

    }
}