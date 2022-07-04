import java.util.Scanner;

public class task21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x;
        x = scanner.nextInt();
        if (x > 23) {
            System.out.println("Не верно");
        } else if (x>=6&& x<10) {
            System.out.println("Утро");
        } else if (x>=10 && x<=18) {
            System.out.println("День");
        } else if (x > 18 && x <= 22) {
            System.out.println("Вечер");
        } else {
            System.out.println("Ночь");
        }

    }
}
