import java.util.Scanner;

class task8 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int x, a, b, c;

        x = scanner.nextInt();

        a = x / 10;
        b = x % 10;
        c = b * 10 + a;

        System.out.println(c + 8);
    }
}