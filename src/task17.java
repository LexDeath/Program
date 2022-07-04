import java.util.Scanner;

public class task17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x, x1, x2, x3, x4, x5, x6;

        x = scanner.nextInt();

        x1 = x / 100000;
        x2 = x / 10000 % 10;
        x3 = x / 1000 % 10;
        x4 = x / 100 % 10;
        x5 = x / 10 % 10;
        x6 = x % 10;

        if ((x1+x2+x3) != (x4+x5+x6)) {
            System.out.println("Не счасливое");
        } else {
            System.out.println("Счастливое");
        }
    }
}
