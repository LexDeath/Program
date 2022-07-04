import java.util.Scanner;

class task11 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int x, y, a, b;

        x = scanner.nextInt();
        y = scanner.nextInt();

        a = x % 10;
        b = y % 10;

        System.out.println(x-a+b);
        System.out.println(y-b+a);
    }
}