import java.util.Scanner;

public class task23 {

    public static void main(String[] args) {
        int x;

        Scanner scanner = new Scanner(System.in);

        x = scanner.nextInt();

        if (x == 1 || x == 2 || x == 3) {
            System.out.println(" 1-й этаж");
        } else if (x % 3 == 0) {
            x /= 3;
            System.out.println(x + "-й этаж");
        } else {
            System.out.println(x / 3 + 1 + "-й этаж");
        }

        while (x > 3) x -= 3;

        if (x == 1) {
            System.out.println("Слева");
        } else if (x == 2) {
            System.out.println("В Центре");
        } else {
            System.out.println("Справа");
        }
    }
}
