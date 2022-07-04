import java.util.Scanner;

public class task24 {
    public static void main(String[] args) {
        int a, b, c;
        Scanner scanner = new Scanner(System.in);

        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();

        if (a == b && b == c) {
            System.out.println("Все чила равны");
        } else {
            if (a > b) {
                System.out.println("Первое больше второго");
            }
            if (a < b) {
                System.out.println("Второе больше первого");
            }
            if (b > c) {
                System.out.println("Второе больше третьего");
            }
            if (b < c) {
                System.out.println("Третье больше второго");
            }
            if (a > c) {
                System.out.println("Первое больше третьего");
            }
            if (a < c) {
                System.out.println("Третье больше первого");
            }
            if (a == b) {
                System.out.println("Первое и второе равны");
            }
            if (b == c) {
                System.out.println("Второе и третье равны");
            }
            if (c == a) {
                System.out.println("Третье и первое равны");
            }
        }
    }
}